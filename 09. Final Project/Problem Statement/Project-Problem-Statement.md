# Problem Statement

## Pre-requisites:

- In this module, you have learned about the following topics:

   - Different types of Layouts (Linear Layout, Relative Layout, and ScrollView)

   - Various widgets (TextView, EditText, ImageView, Buttons, etc)

   - Intents and Shared Preferences

- If you would like one more revision and some more practice, we recommend you go back and go through the module once more. 

- But if you are feeling confident, it is time to put the knowledge to work.

## Procedure:

> Whenever you install a new app, there are a few common things that we come across every time:

- A welcome/start page that displays the app logo and disappears after a few seconds. 

- This is known as the Splash page. This page contains only a background and an Image placed in the center of the page. 

- The next is the Login page which contains the two Edit texts and a Button to log in. Along with these you also find some text which generally says ‘If you do not have an account, Register’ and ‘Forgot Password'.

- When you click on the registration text, you are sent to a new page that requires you to fill in some details like name, phone number, email address, password, and then you can register with the application. 

- This page is the Registration page of the application. 

- Similarly, clicking on the forgot password text sends you to some other page having different functionalities.

- For this assignment, you need to make the above four functionalities in an application. 

- You might be thinking that many of these functionalities require internet and data filled in the fields are stored at someplace. 

- Yes, this happens and we will be learning that in the upcoming modules. 

- But for now, we will simply just make a functional UI for the same. 

- We will provide you with some samples which you can refer to. 

- However, we strongly recommend that you try to use your own imagination and make the UI look even better.


## Specifications:

### Welcome Page (aka Splash Page)

- This will be the first page that gets displayed when the user opens the app. 

- This page will contain the app name and/or app logo. 

- You can also use any custom background for this page. 

- This page will be displayed for 2 seconds and then it moves on to the login page without any user interaction. 

- The automatic exiting of the page is done by the usage of threads. We do not have to learn more about them here. 

- We will learn about them in-depth when we reach the concept of Multithreading in the next module. 

- This is a very important topic, so for now, we would like you to Google about exiting the splash (this is a very vast subject and you’ll need your best googling skills in order to excel in the subject).

- Refer to the screenshot below and try to make it.

<h5 align = "center">  Image Description: Splash Screen </h5>

  <p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Final-Project/01.png" alt="Image Description" />
       </p>
  <h6 align = "center">  Image Description: (*Don’t worry if you fail to find the functionality on Google. Refer to the cheat code given at the end of this document). </h6>

### Login Page

- The login page is displayed after the welcome/splash page. 

- The user should be able to enter the mobile number and password and click on the Login button present below it.

- For now, clicking on the Login button should take the user to a new blank screen where the user is greeted with a welcome message and can view the credentials entered. 

- This will be done by sending the data using the Intents. 

- Clicking on the forgot password text will take the user to the forgot password page while clicking on the registration text will redirect the user to the registration page. 

- Refer to the screenshot below for a better understanding and try to make the page. 

<h5 align = "center">  Image Description: Login Page </h5>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Final-Project/02.png" alt="Image Description" />
       </p>

#### Bonus:

- Save the login instance as true in shared preferences and when the user opens the app for the next time, she is not asked to log in again. 

- This can be a bit tricky, so try to implement it without crashing the app.


### Registration Page

- This page contains the following fields namely: Name, Email Address, Mobile Number, Delivery Address, and Password which users will input and register for the app.

- For now, you only need to create the page and the functionality for this will be made later. 

- On clicking the register button, the user is taken to a blank page where the entered information will be displayed. 

- Similar to the login page, this will be done with the help of Intents.

- Refer to the screenshot below for a better understanding and try to make the page.

<h5 align = "center">  Image Description: Registration Page </h5>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Final-Project/03.png" alt="Image Description" />
       </p>

### Forgot Password Page

- This page will contain only two fields where the user is requested to enter the mobile number and email address.

- On clicking the next button the user is again redirected to the blank screen where the entered information is displayed.

- Refer to the screenshot below for a better understanding and try to make the page.

<h5 align = "center">  Image Description: Forget Password Page </h5>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Final-Project/04.png" alt="Image Description" />
       </p>

## Cheat Code:

> Splash page thread implementation: In the onCreate() method, just put the startActivity() method inside a Handler()


<h2 align = "center">  Image Description: All the best! </h2>


## Output:

<h5 align = "center">  Image Description: All the best! </h5>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Final-Project/Outputs/01.png" alt="Image Description" />
       </p>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Final-Project/Outputs/02.png" alt="Image Description" />
       </p>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Final-Project/Outputs/03.png" alt="Image Description" />
       </p>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Final-Project/Outputs/04.png" alt="Image Description" />
       </p>

<p align="center">
  <img src="https://github.com/Amit-Ashok-Swain/Android-Kick-Off/blob/main/images/Final-Project/Outputs/05.png" alt="Image Description" />
       </p>