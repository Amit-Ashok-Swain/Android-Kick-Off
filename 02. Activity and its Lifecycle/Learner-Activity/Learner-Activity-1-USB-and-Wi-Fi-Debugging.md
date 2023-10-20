# Learner Activity 1
    - Before we proceed with the next video, if you are using a Windows system to run the Android Studio, you might need to install the appropriate USB driver for your device. You can use this link to do so.

    - Let’s start setting up our Android device. To do this, first we need to enable USB debugging. Let’s do the following steps.

        - Connect your device to your development machine with a USB cable.
        - Once you have done this, enable ‘USB debugging’ in the ‘Developer options’ in this manner.
        - First, to enable ‘Developer options’, open the ‘Settings’ app.
        - Now select ‘System’. This option will be available only for Android 8.0 or higher versions. For other versions, you will not get this option and will directly move to the next step.
        - Now, scroll to the bottom of the screen and select ‘About phone’.
        - Now again scroll to the bottom of the screen and tap on ‘Build number’ 7 times.
        - Now return to the previous screen to find the ‘Developer options’ near the bottom of the screen.
        - Now, open ‘Developer options’ and scroll down to find and enable ‘USB debugging’.
        - After this, a dialog box will come up in your phone which will ask you to allow for USB debugging from a particular device. 
        - Select the checkbox for ‘Always allow from this device’ and then tap on ‘Ok’.


    - Before we proceed with enabling WiBi debugging, ensure that you have already set up Android Studio and have your Android device ready.

       1. Connect your Android Device to WiFi:
          - Make sure your Android device is connected to the same Wi-Fi network as your development machine.

       2. Enable Developer Options:
           - Open the 'Settings' app on your Android device.

       3. **Access About Phone**:
           - Scroll down and select 'About phone'.

       4. Tap on Build Number:
           - Tap on 'Build number' 7 times. You will be prompted to enter your device's PIN or pattern to confirm your actions.

       5. **Enable Developer Options**:
           - After successfully tapping the 'Build number' 7 times, you will see a message confirming that you have enabled Developer Options. Return to the previous screen.

       6. Access Developer Options:
           - Now, you should see 'Developer options' near the bottom of the screen (inside the 'System' or 'About phone' menu). Open 'Developer options'.

       7. Enable WiFi Debugging:
           - Scroll down in the 'Developer options' menu to find 'WiFi Debugging' or a similar option related to wireless debugging.

       8. Confirmation:
           - When you enable WiBi debugging, a dialog box may appear on your device, asking you to confirm the connection. Select the checkbox for 'Always allow from this device' and then tap 'Ok'.

    - Once you've completed these steps, your Android device should be set up for WiBi debugging, and you can connect it to Android Studio for wireless debugging over the same Wi-Fi network.


    Enabling Wi-Fi debugging for Android devices involves using the Android Debug Bridge (ADB) over a Wi-Fi connection. Here are the steps to set up Wi-Fi debugging:

**Prerequisites**:
- Make sure your Android device is connected to the same Wi-Fi network as your development machine.
- You should have already enabled Developer Options on your Android device. If not, please follow the steps mentioned in the previous response.

Now, let's proceed with enabling Wi-Fi debugging:

1. **Connect your Android Device via USB (One-Time Setup)**:
   - Connect your Android device to your development machine via a USB cable.

2. **Enable USB Debugging (One-Time Setup)**:
   - Ensure that USB debugging is enabled on your Android device. You can follow the steps mentioned in your initial instructions for enabling USB debugging.

3. **Open a Command Prompt or Terminal on Your Development Machine**.

4. **Check ADB Devices**:
   - In the command prompt or terminal, type the following command to check if your device is recognized by ADB:
     ```
     adb devices
     ```
   - You should see your device listed.

5. **Get Your Device's IP Address**:
   - To set up Wi-Fi debugging, you'll need to know your device's IP address. You can find it in the device's 'Settings' app under 'Network & Internet' > 'Wi-Fi' > [Your Wi-Fi Network] > 'Advanced' > 'IP address.'

6. **Disconnect the USB Cable**:
   - Disconnect the USB cable from your Android device.

7. **Enable Wi-Fi Debugging**:
   - In the command prompt or terminal, enter the following command, replacing `DEVICE_IP_ADDRESS` with your Android device's IP address:
     ```
     adb tcpip 5555
     ```

8. **Connect to Your Android Device via Wi-Fi**:
   - In the command prompt or terminal, enter the following command to connect to your Android device via Wi-Fi:
     ```
     adb connect DEVICE_IP_ADDRESS:5555
     ```
   - Replace `DEVICE_IP_ADDRESS` with your Android device's IP address.

9. **Check the Connection**:
   - You can verify that your device is connected over Wi-Fi by running:
     ```
     adb devices
     ```
   - You should see your device listed with its IP address.

Now your Android device is set up for Wi-Fi debugging. You can disconnect the USB cable and continue debugging your device over the Wi-Fi network. Make sure both your development machine and Android device stay connected to the same Wi-Fi network for this to work.