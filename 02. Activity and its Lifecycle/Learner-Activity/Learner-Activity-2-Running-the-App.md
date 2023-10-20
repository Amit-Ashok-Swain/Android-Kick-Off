# Learner Activity 2

## Open and close the app using different mechanisms like getting a call in between or directly removing it from the recent apps screen and check how the methods are called in those cases.

When you open and close an Android app using different mechanisms, such as receiving a call in between or removing it from the recent apps screen, the Android activity lifecycle methods are called in various sequences. Let's explore these scenarios:

1. **Normal Activity Lifecycle**:
    - When you open the app and navigate within it, the typical sequence of lifecycle methods is: `onCreate()` -> `onStart()` -> `onResume()` as you bring the app to the foreground, and `onPause()` -> `onStop()` -> `onDestroy()` as you navigate away from the app or close it.

2. **Receiving a Phone Call**:
    - If you receive a phone call while your app is in the foreground, the activity's lifecycle methods are called as follows:
        - `onPause()`: Called when the phone call takes priority over the app.
        - After the call ends, Android typically restores the app, calling `onRestart()`, `onStart()`, and `onResume()` in that order. These methods bring the app back to the foreground.

3. **Removing the App from Recent Apps Screen**:
    - When you remove the app from the recent apps screen, Android may call the activity's lifecycle methods differently. The sequence can be:
        - `onPause()`: Called when you switch away from the app.
        - `onStop()`: Called when Android decides to reclaim resources. This may happen immediately or after some time.
        - `onDestroy()`: Called when the app is completely removed from memory.

It's important to note that Android's behavior may vary depending on system resources, device configuration, and Android version. Android aims to provide a seamless user experience, so the system may optimize the order of these methods to improve performance and resource usage.

Developers should design their apps to handle these variations gracefully and preserve important state information. The sequence of lifecycle methods can change based on system conditions, and apps should be resilient to these changes to provide a consistent and user-friendly experience.


## Find out the cases when onDestroy() is called before onPause() and onStop(). You can Google this or try different things in the activity lifecycle application that we just made.

In the standard Android activity lifecycle, `onDestroy()` is supposed to be called after `onPause()` and `onStop()`. However, there are a few scenarios where `onDestroy()` may be called before `onPause()` and `onStop()` due to specific circumstances or issues. Here are a couple of scenarios where this can happen:

1. **Low Memory Conditions**:
   - Android may terminate activities to free up memory when the system is running low on resources. In such situations, Android may skip calling `onPause()` and `onStop()` and directly call `onDestroy()` on an activity to release resources more quickly.
   - This is a rare scenario, but it can happen when Android determines that the activity is a good candidate for termination. It's important to note that Android tries to preserve the user's most recently used activities.

2. **System-Initiated Destruction**:
   - Some Android system components may forcibly destroy activities. For example, if a configuration change occurs (e.g., a screen rotation) and the developer has not correctly implemented handling for configuration changes using `android:configChanges` in the manifest or by handling it programmatically, Android may destroy and recreate the activity.
   - In such cases, `onDestroy()` can be called before `onPause()` and `onStop()` as the activity is recreated immediately after destruction.

3. **Process Termination**:
   - If the entire process in which the activity is running is terminated by the system, it can lead to `onDestroy()` being called before `onPause()` and `onStop()`. This can happen in rare situations where the system needs to reclaim resources.

- It's essential to design your Android app to handle these situations gracefully. 
- While the standard lifecycle sequence should be followed in most cases, the exceptions mentioned above can occur, and your app should be resilient to such variations. 
- Properly saving and restoring the app's state is crucial to ensure a smooth user experience even when the activity lifecycle does not follow the ideal sequence.


# Let's understand it with example:

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/01.png" alt="Image Description" />
</p>

*Image Description: The mobile device is connected with Android Studio and device mirroring is on the screen.*

 <p align="center">
<img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/02.png" alt="Image Description" />
</p>

*Image Description: Navigation of 'run' Button in Android Studio.*

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/01.png" alt="Image Description" />
</p>

*Image Description: Running is Process.*

 <p align="center">
<img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/02.png" alt="Image Description" />
</p>

*Image Description: Successfully the App has run and displaying the main activity .*

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/01.png" alt="Image Description" />
</p>

*Image Description: The connected message in in 'run' console box and later navigate to 'Logcat' button.*

 <p align="center">
<img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/02.png" alt="Image Description" />
</p>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/01.png" alt="Image Description" />
</p>

*Image Description: Search "System.out" in 'Logcat' console box an you'll be able to see Activity callback methods in Logcat console box.*

 <p align="center">
<img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/02.png" alt="Image Description" />
</p>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/01.png" alt="Image Description" />
</p>

*Image Description: onStart function is called as soon as the App was active and after clicking 'home button' in mobile it went to onPause and onStop state.*

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/01.png" alt="Image Description" />
</p>

 <p align="center">
<img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/02.png" alt="Image Description" />
</p>

*Image Description: Open in the recent app button and again resuming the app onRestart onStart and onResume method is called.*

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/01.png" alt="Image Description" />
</p>

*Image Description: Click the back button again the activity calls onPause and onStop methods .*

 <p align="center">
<img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/02.png" alt="Image Description" />
</p>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Creating-Callbacks-in-the-Activity-Class/Bundle/01.png" alt="Image Description" />
</p>

*Image Description: Click recent app button and clearing it from memory then it calls onDestroy method.*


