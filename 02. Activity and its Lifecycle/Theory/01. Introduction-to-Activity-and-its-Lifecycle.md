# Introduction to Activity and its lifecycle
 - What is an Activity?
   -> An activity is a screen on your device, which consists of the user interface.
   -> An activity provides the window in which the app draws its UI.
- Now an app has many screens and all these different types of screens can be said as different activities. Therefore, we can say that an app has multiple activities.
- For Example: Let's look up the Instagram App
  1. The first screen when we open the app is the 'Main Activity'. Every app has its 'Main Activity'.
  2. Let's say now we move to any person's profile. The profile of the person will be a different activity.
  3. Now let's say we move to another person's profile page will it be a different activity too? Well! The answer is 'No'. All profile pages for the person will have the same layout. Hence, the profile for every person will be the same.
  4. All the user's profile pages are one single activity is the content that gets changed.
  5. Now let's say in a person's profile we open their picture post then it's a different activity. Hence, we can say all picture post pages will be the same activity.
  6. The activities of an app are all related.
  7. Suppose in Instagram we move from the Main Activity(Homepage/start screen of Instagram) to some different Activity then the previous activity gets paused. 
     For Example: if we open the Instagram app we are redirected to the homepage or start page then if we click on the dm button on the right top screen it redirects us to a different activity which is the dm page and the homepage activity will be paused for the instance after switching to dm page activity.

 - Some points about an activity: 
 1. An activity has different states, like create, pause, stop, destroy, etc.
 2. These states are attained by an activity because of some events. It is based on the user's behavior.
 3. An activity has different events like creation, pausing, destroying, etc.
 4. These events are triggered by user interaction.
 5. When an activity enters a particular state, the method related to that state is called.
 6. All this goes on in accordance with the activity lifecycle.

 - What is an Activity Lifecycle?
  ->The Android Activity Lifecycle refers to the series of states or stages that an Android activity goes through during its existence. An activity is a fundamental component of an Android app that represents a single screen with a user interface. Understanding the activity lifecycle is crucial for developing Android apps, as it allows developers to manage and control the behavior of an activity based on its current state.
  -> As a user navigates the app and goes back and later comes back to the app. The activity instances in the app transition through various states in their lifecycles.
  -> So we write code in our app. The activity class has the number of methods which are known as Callbacks. These methods are triggered when various events take place in the activity.

 - Callbacks/methods in the activity lifecycle
   1. onCreate()
   2. onStart()
   3. onResume()
   4. onPause()
   5. onStop()
   6. onDestroy()
   7. onRestart()

  1. onCreate()
    - This is the mandatory callback method and every activity must have it.
    - It is used to create the startup logic of the activity.
    - This method calls the onStart() and onResume() methods in quick succession.

  2. onStart()
    - This method makes the activity visible to the user, as the app prepares to enter the foreground and become interactive.
    - The activity does not remain in this state for long, and the onResume() method is called quickly.

  3. onResume()
    - This method is called when the activity is ready for interaction with the user.
    - The activity remains in this state till the user is interacting with it.
    - It changes this state in case of interruptions. 
        For Example: When a phone call is coming when the user navigates to some other activity of the same app or when the device screen turns off. Hence when the interruption occurs the activity goes to a pause state.
  
  4. onPause()
    - The activity moves to this state either when it does not remain in the foreground anymore(means the user has navigated to some activity in the app), or if the app window loses focus(when two apps are running simultaneously in a split screen and the user is interacting with one of them in this case the other app activity loses focus.
    - The resources are freed up in this state.
    - This state can change in two conditions:
      1. If the activity is resumed and is being used again. Once the activity is resumed the onResume() method is called. Now the system keeps the activity instance that was last shown to the user in memory and recalls that instance when the onResume method is called.
         For Example: When you move from one app to another and then come back to the first app you come back to the same screen(activity) where you had left off. That is what we mean by returning to the same instance.
      2. If the activity becomes completely invisible to the user. Now if an activity wants to be completely invisible then the onStop() method will be called. 

  5. onStop()
    - When an activity is no longer visible to the user, it enters the stop state and the system invokes the oneStop() method.
    - This method can be allowed when another newly launched activity covers the screen.
    - This state may also be invoked by the system if it needs more resources for other apps. For example, if the RAM of the device is low and it needs it for other functions it can directly stop the activity without sending it to a pause state.
    - All resources must freed up in this state. For example, you get a call and you're on that call for a long time say for an hour. In this activity first goes into the pause state and eventually will get stopped(stop state).

  6. onDestroy()
    - This is the final call that activity receives.
    - This method may be invoked due to the user's actions such as when the user stops using the app and removes it from the background also or it may be invoked by the system when it wants to free up space for some other important functions. You may have seen sometimes an app stops responding. Well, that's because the activity faces a storage of resources and hence it is destroyed. 

  7. onRestart()
    - When the activity is returned to the active state for the user, this method is called.
   



     <h1 align = "center"> Flow-Chart of Activity Lifecycle </h1>

![activity-lifecycle-image](https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/activity-lifecycle.png)

1. First, when the activity is launched it gets created then it starts and then it resumes all in quick succession.
2. It is only when the activity resumes that is ready for use. All this is done by the onCreate, onStart(), and onResume() methods respectively.
3. Now, when the user moves on to the next screen or activity in the app. The current activity goes into a pause state and then the onPause() method is called.
4. While using Android devices or an App we tend to come back to previous screens and this is the reason that the previous screens are not stopped immediately but instead, they enter the paused state.
5. After a while, the inactive activity goes from the paused state to the stopped state. Thus the onStop() method is called.
6. Then finally when we exit the app. The activity gets destroyed and then the onDestroy() method is called. This freezes up the resources and memory that were been used by the activity.
7. Also, when the activity is in the stopped state the user navigates to the activity again. The activity starts again and the onRestart() method is called.
8. Sometimes, when the activity is in the stopped state. The device may need memory for other high-priority apps so it destroys the activity.
9. And so when the user navigates again to the activity. The activity is created again and onCreate() Method is called.
10. Similarly, When the activity is in the paused state and the user navigates to the activity again. The activity resumes for interaction and onResume() Method is called.
11. But again sometimes the system may need to free up the memory for other important apps and in this case, the activity is destroyed.
12. And when the user navigates to the activity again, the onCreate() Method will be called again.
- This is the usual behavior of the activity lifecycle. You can refer to the flowchart above while reading the above context.




# Let's dive deeper into the Android activity and its lifecycle:

1. **Activity States:**
    - **Active/Running:** The activity is in the foreground, and it's actively interacting with the user. This is where the main user interface and user interactions take place.
    - **Paused:** The activity is partially obscured, often due to a dialog or another non-fullscreen activity, but it's still visible to the user. It can return to the active state without being recreated.
    - **Stopped:** The activity is no longer visible but retains its state and member variables. It can be brought back to the foreground by the user.
    - **Destroyed:** The activity is terminated, and its resources are released. This happens when the user closes the activity or the system destroys it to free up resources.

2. **Activity Lifecycle Methods:**
    - `onCreate()`: This is called when the activity is first created. It's where you set up the initial state, initialize UI components, and perform any one-time setup.
    - `onStart()`: Called when the activity is becoming visible to the user but is not yet in the foreground. It's a good place to initialize components that should be visible.
    - `onResume()`: Called when the activity is in the foreground, and the user can interact with it. You should start any animations or sensors here and make UI updates.
    - `onPause()`: Called when the activity is partially obscured, such as when another activity is on top. Use this to pause ongoing work, release system resources, and save any changes.
    - `onStop()`: Called when the activity is no longer visible. This is where you can release resources that are no longer needed.
    - `onDestroy()`: Called when the activity is being destroyed, either by the system or by calling `finish()`. It's your last chance to clean up resources.

3. **Activity Transitions:**
    - When an activity transitions from the stopped to the running state, `onRestart()` is called before `onStart()`. This is often used for re-initializing resources that were released in `onStop()`.
    - When it transitions from the paused to the running state, `onResume()` is called, allowing you to resume activities that were paused.
    - When it transitions from running to the paused state, `onPause()` is called to pause ongoing work and save changes.
    - When it transitions from the running to the stopped state, `onStop()` is called, and you can release unnecessary resources.

4. **Activity Lifecycle Scenarios:**
    - **Configuration Changes:** If the device's configuration changes, like screen orientation, Android destroys and recreates the activity. You can use `onSaveInstanceState()` to save and restore important data.
    - **Lifecycle Callbacks:** By overriding these lifecycle methods, you can perform specific actions at different points in the activity's life cycle, such as saving and restoring state, handling UI updates, and managing resources efficiently.
    - **Activity Stack:** Activities are managed in a stack, and you can navigate between them using intents (e.g., starting new activities) and back button presses. Understanding the activity stack is crucial for navigation within your app.

5. **Tasks and Back Stack:**
    - Android maintains a back stack for activities, allowing users to navigate backward through the app's history.
    - Activities are often organized into tasks, and each task can have its own back stack.
    - You can control the behavior of activities in the back stack using launch modes and intent flags, allowing for various navigation patterns within your app.

Understanding the Android activity lifecycle is essential for building responsive and reliable apps. Properly managing state, resources, and user interactions can lead to a better user experience. It also helps you handle interruptions, such as phone calls or switching to other apps, without losing important data or context in your app.


# Let's explore the Android activity lifecycle with a theoretical example of a simple note-taking app. This app allows users to create and edit notes.


**Scenario:** You open the app, create a new note, edit it, and then receive a phone call.

1. **`onCreate()`:** You launch the app. In the `onCreate()` method of the main activity, you set up the user interface, initialize variables, and prepare to display a list of notes.

2. **`onStart()`:** The app's main activity is now visible, but no notes are displayed yet. The `onStart()` method is called, and you initiate loading the list of notes from a database or a file.

3. **`onResume()`:** The main activity is in the foreground. The list of notes is displayed, and you can interact with the app. The `onResume()` method is called. You start listening for user interactions like adding, editing, or deleting notes.

4. **Creating a New Note:**
    - You tap the "Create New Note" button.
    - A new activity for creating notes is launched. The new note activity goes through the same lifecycle, starting with `onCreate()`, `onStart()`, and `onResume()`.

5. **Editing a Note:**
    - You tap an existing note to edit it.
    - The note editing activity is launched. It goes through its own lifecycle like the main activity.

6. **Phone Call:**
    - While you're editing a note, you receive a phone call.
    - The current note editing activity goes into the `onPause()` state because it's partially obscured by the incoming call screen.

7. **`onStop()`:** You answer the call, and the main activity is no longer visible because the note editing activity is in the foreground. The main activity's `onStop()` method is called.

8. **Resuming the App:**
    - You finish the call and return to the app.
    - The main activity comes back into view, and `onRestart()` and `onStart()` are called. You load the list of notes again.

9. **`onResume()`:** The main activity is now in the foreground. `onResume()` is called, and you can continue interacting with your notes.

10. **Exiting the App:**
    - You decide to exit the app. You press the back button or use another exit method.
    - The `onPause()`, `onStop()`, and `onDestroy()` methods of the main activity are called as the app is terminated.

This example demonstrates how Android activities go through their lifecycle as you navigate through the app and respond to external events like phone calls. It also emphasizes the importance of properly saving and restoring app state and resources to ensure a seamless user experience.


# Let's explore the Android activity lifecycle with a theoretical example using the Instagram app.

**Scenario:** You open the Instagram app, log in, browse your feed, like a photo, and then receive a notification.

1. **`onCreate()`:** You launch the Instagram app. In the `onCreate()` method of the main activity, the app initializes the user interface, loads user data, and sets up the feed for you to browse.

2. **`onStart()`:** The main activity is visible, but your feed is not yet loaded. The `onStart()` method is called, and the app starts loading your feed from the server.

3. **`onResume()`:** The main activity is in the foreground, and your feed is displayed. The `onResume()` method is called. You can scroll through your feed, like photos, and interact with the app.

4. **Logging In:**
    - You decide to log in to your account.
    - A new activity for the login screen is launched. This activity goes through its own lifecycle: `onCreate()`, `onStart()`, and `onResume()`.

5. **Browsing Your Feed:**
    - After logging in, you are redirected to the main activity.
    - The main activity is resumed and you continue scrolling through your feed.

6. **Liking a Photo:**
    - You double-tap on a photo to like it.
    - The app processes your like action, updates the UI, and saves this information to the server. The main activity is still in the foreground.

7. **Receiving a Notification:**
    - While you are still using the app, you receive a notification.
    - The app displays the notification, possibly in the form of a dialog or a notification bar entry.
    - The main activity is partially obscured, and it goes into the `onPause()` state.

8. **`onStop()`:** You tap the notification to view more details. The main activity is no longer visible as you're viewing the notification details. Its `onStop()` method is called.

9. **Returning to the App:**
    - After viewing the notification, you tap it to return to the Instagram app.
    - The main activity is brought back into view. `onRestart()` and `onStart()` are called as the app prepares to display your feed again.

10. **`onResume()`:** The main activity is now fully in the foreground. `onResume()` is called, and you can continue interacting with the app.

11. **Exiting the App:**
    - You decide to exit the app. You press the back button or use another exit method.
    - The `onPause()`, `onStop()`, and `onDestroy()` methods of the main activity are called as the app is terminated.

- This example illustrates how Android activities within the Instagram app go through their lifecycle as you navigate through the app and respond to external events like notifications.
- The app efficiently manages its activities to provide a smooth user experience while interacting with the social media platform.

