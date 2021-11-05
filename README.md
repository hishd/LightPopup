# Light Popup
[![](https://jitpack.io/v/hishd/LightPopup.svg)](https://jitpack.io/#hishd/LightPopup)

LightPopup for android, a simple delightful popup dialog with both single and non dual action type

### Screenshot
[![](https://github.com/hishd/LightPopup/blob/master/images/image1.png)](https://github.com/hishd/LightPopup/blob/master/images/image1.png)
[![](https://github.com/hishd/LightPopup/blob/master/images/image2.png)](https://github.com/hishd/LightPopup/blob/master/images/image2.png)

### Installation & Setup

------------

The easiest way to use Animdialog is to add the android library to your projects dependencies

##### Maven
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
add to dependency,
```
<dependency>
	    <groupId>com.github.hishd</groupId>
	    <artifactId>LightPopup</artifactId>
	    <version>1.6</version>
	</dependency>
```

##### Gradle
Add the repository to your project build.gradle

```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
add dependency,
```
dependencies {
	        implementation 'com.github.hishd:LightPopup:1.0.2'
	}
```

## Usage

#### Show single action dialog
```
new LightPopup(this)
                    .createSingleActionDialog()
                    .setBackgroundColor(R.color.white)
                    .setTitleColor(R.color.blue_light)
                    .setMessageColor(R.color.black)
                    .setBtn1CaptionColor(R.color.white)
                    .setBtn1AllCaps(false)
                    .setCancelledOnOutside(false)
                    .setTitle("Single Action")
                    .setMessage("This is a single action dialog with containing only a single button.")
                    .setBtn1Caption("Cancel")
                    .setBtn1Color(R.color.red)
                    .setBtn1Action(Dialog::dismiss).show();
```
#### Show dual action button dialog
```
new LightPopup(this)
                    .createDualActionDialog()
                    .setBackgroundColor(R.color.white)
                    .setTitleColor(R.color.blue_light)
                    .setMessageColor(R.color.black)
                    .setBtn1CaptionColor(R.color.white)
                    .setBtn2CaptionColor(R.color.white)
                    .setBtn1AllCaps(false)
                    .setBtn2AllCaps(false)
                    .setCancelledOnOutside(false)
                    .setTitle("Dual Action")
                    .setMessage("This is a single action dialog with containing two buttons with different actions.")
                    .setBtn1Caption("Cancel")
                    .setBtn1Color(R.color.red)
                    .setBtn1Action(Dialog::dismiss)
                    .setBtn2Caption("Ok")
                    .setBtn2Color(R.color.blue_light)
                    .setBtn2Action(Dialog::dismiss).show();
```

#### Usages of the methods
| Method Name  | Operation   |
| ------------ | ------------ |
| createSingleActionDialog()  | Create a single button dialog  |
| createDualActionDialog()  | Create a dual button dialog  |
| setBackgroundColor(int color)  | Changes the background color of the dialog  |
| setTitleColor(int color)  | Changes the title color of the dialog  |
| setMessageColor(int color)  | Changes the color of the content  |
| setBtn1CaptionColor(int color)  | Changes the button 1 caption color of the single action dialog  |
| setBtn2CaptionColor(int color)  | Changes the button 1 caption color of the dual action dialog  |
| setBtn1AllCaps(boolean isAllCaps)  | Sets whether all the button 1 letters are capitalized  |
| setBtn2AllCaps(boolean isAllCaps)  | Sets whether all the button 2 letters are capitalized  |
| setCancelledOnOutside(boolean cancellable)  | Setting true will dismiss once clicked outside  |
| setTitle("Title Name") | Sets the title of the dialog  |
| setMessage("Message")  | Sets the content of the dialog  |
| setBtn1Caption("Button Title")  | Sets the title of the button 1  |
| setBtn1Color(int color)  | Sets the button 1 color  |
| setBtn2Color(int color)  | Sets the button 2 color  |
| setBtn1Action(LightPopupDialogListener listener)  | Sets the listener for the button 1  |
| setBtn2Action(LightPopupDialogListener listener)  | Sets the listener for the button 2  |

###### Please Refer the Sample project for more information.

