package com.gorillalogic.monkeytalk.mtbrowser.automators;

import com.gorillalogic.fonemonkey.automators.AutomatorBase;
import com.gorillalogic.monkeytalk.mtbrowser.MTBrowserActivity;

public class BrowserAutomator extends AutomatorBase {

	@Override
	public String getComponentType() {
		return "Browser";
	}

	private String formattedUrl(String url) {
		if (!(url.contains("http://") || url.contains("https://") || url.contains("file://")))
			url = "http://" + url;

		return url;
	}

	@Override
	public String play(String action, String... args) {
		if (action.equalsIgnoreCase("open")) {
			assertArgCount("Open", args, 1);
			String url = formattedUrl(args[0]);

			MTBrowserActivity.open(url);
			return "";
		}

		if (action.equalsIgnoreCase("back")) {
			MTBrowserActivity.back();
			return "";
		}

		if (action.equalsIgnoreCase("forward")) {
			MTBrowserActivity.forward();
			return "";
		}
		return super.play(action, args);
	}

}
