## What is it?
MarkdownView is an Android webview with the capablity of loading Markdown text or file and display it as HTML, it uses MarkdownJ and extends Android webview. 

## Demo app Screenshot
This is a Screenshot from the demo app where it shows a markDown text in the upper half of the screen and when you hit update
it will reload the text to MarkdownView (lower half of the screen).

![MarkdownView screenshot](http://i.imgur.com/fNiSS.png)

##How to use it? 

- To add MarkdownView to your project, include the jar, or the source code. 
- Simple usage is to set the whole activity to a MarkdownView by Adding the following to your onCreate method:

```java
MarkdownView markdownView = new MarkdownView(this);
setContentView(markdownView);
```
 
- Or you can also add it to your layout by using `<us.feras.mdv.MarkdownView android:id="@+id/markdownView" />` 
and referance it in your activity:  

```java
MarkdownView markdownView = (MarkdownView) findViewById(R.id.markdownView);
```

##Loading MarkDown text or file (local and online): 

- **loadMarkdownData(String text)**
Using this method will result in loading md string to the MarkdownView and displaying it as HTML. 

 
- **loadMarkdownUrl(String url)**
You can use this method to load local or online files. 

To load a locale file, you have to add it to your assets folder and pass a url that start with "file:///android_asset/" : 

```java
markdownView.loadMarkDownData("file:///android_asset/myFile.md");
```

To load a file on the web you need to pass the full url :    

```java
markdownView.loadMarkDownData("http://www.my-site.com/myFile.md");
```

## License
Licensed under the Apache License, Version 2.0. (The same as the Android project.)
