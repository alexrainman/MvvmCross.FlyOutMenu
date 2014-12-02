MvvmCross.FlyOutMenu
====================

FlyOutMenu implementation for MvvmCross.

This demo project uses:

https://github.com/jdehlin/Xamarin-Sidebar

https://github.com/Cheesebaron/SlidingMenuSharp

http://blog.ostebaronen.dk/2013/11/getting-support-v7-working-with.html

http://forums.xamarin.com/discussion/10946/does-anyone-know-can-we-use-slidingmenusharp-with-mvvmcross

Big thanks to Jack Dehlin, the creator on Sidebar Navigation component http://components.xamarin.com/view/sidebarnavigation and Tomasz Cielecki (Cheesebaron) for his SlidingMenu port.

Sidebar Navigation component was the starting point for this solution.

In the Core PCL project you will find 3 ViewModels.

RootViewModel (app starting point and menu/content container), HomeViewModel and MenuViewModel.

iOS version follows Sidebar Navigation implementation: RootView MvxController initializes the Sidebar navigation with HomeView and MenuView MvxViewControllers. Both HomeView and MenuView has their own ViewModels so you can use bindings, and, as they are NavigationControllers, you can push View controllers from them.

![ScreenShot](https://raw.githubusercontent.com/alexrainman/MvvmCross.FlyOutMenu/master/Screenshots/FlyOutMenu.Touch_1.png)

![ScreenShot](https://raw.githubusercontent.com/alexrainman/MvvmCross.FlyOutMenu/master/Screenshots/FlyOutMenu.Touch_2.png)

Android version follows the same implementantion with Support Library V7 and MvxFragments: RootView activity initializes the SlidingMenu with HomeView and MenuView MvxFragments. Both HomeView and MenuView fragments has their own ViewModels, so, you can use bindings. Addons folder contains MvxActionBarActivity and MvxSlidingActionBarActivity implementations. You have access to SupportActionBar, inflate menus and follow Android design guide lines plus a fully customizable SlidingMenu.

![ScreenShot](https://raw.githubusercontent.com/alexrainman/MvvmCross.FlyOutMenu/master/Screenshots/FlyOutMenu.Droid_1.png)

![ScreenShot](https://raw.githubusercontent.com/alexrainman/MvvmCross.FlyOutMenu/master/Screenshots/FlyOutMenu.Droid_2.png)

Feel free to download and use!

I don't target Windows Phone. Can you add WP version?

Cheers!
