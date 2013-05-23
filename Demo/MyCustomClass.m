//
//  MyCustomClass.m
//  Demo
//

#import "MyCustomClass.h"

@implementation MyCustomClass

/* MonkeyTalk will call this class method using App.Exec */
+ (NSString *) sayHello:(NSArray *)args {
    NSLog(@"Hello, %@!", args);
    return [@"hello " stringByAppendingString:[args componentsJoinedByString:@","]];
}

@end
