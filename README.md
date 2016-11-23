
![MarkdownView screenshot](http://i.imgur.com/PufzgYX.jpg)
[![Download](https://api.bintray.com/packages/falnatsheh/maven/MarkdownView/images/download.svg)](https://bintray.com/falnatsheh/maven/MarkdownView/_latestVersion)

## About

MarkdownView (Markdown For Android) is an Android library that helps you display Markdown text or files (local/remote) as formatted HTML, and style the output using CSS.

The MarkdownView itself extends Android Webview and adds the necessary logic to parse Markdown (using MarkdownJ) and display the output HTML on the view.

## Getting started

- To add MarkdownView to your project, add the following to `build.gradle` file:
```javascript
	dependencies { 
	    compile 'us.feras.mdv:markdownview:1.1.0'
	}
```

## Usage

Add MarkdownView to your layout: 

```xml
    <us.feras.mdv.MarkdownView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/markdownView" />
```

and reference it in your Activity/Fragment:  

```java
MarkdownView markdownView = (MarkdownView) findViewById(R.id.markdownView);
markdownView.loadMarkdown("## Hello Markdown"); 
```
**Note**:
You could also create the view by code. Below an example of how to set the whole activity to be a MarkdownView by Adding the following to your onCreate method:

```java
  MarkdownView markdownView = new MarkdownView(this);
  setContentView(markdownView);
  markdownView.loadMarkdown("## Hello Markdown"); 
```

## Screenshots

<img src="http://i.imgur.com/gY8eXaj.jpg" width="300"> 
<img src="http://i.imgur.com/ETHYbCv.jpg" width="300"> 

## Demo App and Code Sample

The above screenshots taking from the demo app which could be found here. The demo app include code to demonstrate: 

- Loading Local Markdown File. 
- Loading Remote Markdown File. 
- Loading Markdown text.
- Live Preview sample code (similar to [Marked Mac app](http://marked2app.com/))
- Themes

## Loading Markdown text or file: 

- `loadMarkdown(String text)`:
Using this method will result in loading md string to the MarkdownView and displaying it as HTML. 

 
- `loadMarkdownFile(String url)`:
You can use this method to load local or online files. 

To load a local file, you have to add it to your assets folder and pass a url that start with "file:///android_asset/" : 

```java
markdownView.loadMarkdownFile("file:///android_asset/myFile.md");
```

To load a remote file you need to pass the full url :    

```java
markdownView.loadMarkdownFile("http://www.my-site.com/myFile.md");
```

## Theming

You could apply custom CSS to the MarkdownView. Example: 

```java
markdownView.loadMarkdownFile("file:///android_asset/hello.md","file:///android_asset/MyCustomTheme.css");
```
You could take a look at CSS example [here](https://github.com/falnatsheh/MarkdownView/tree/master/MarkdownViewDemo/assets/markdown_css_themes), you could also view them in the sample app.

## ChangeLog: 

- **MarkdownView 1.1.0**:
	- Support Loading Markdown file from assets subfolders (Thanks [@echodjb](https://github.com/DiegoRosado)). 
- **MarkdownView 1.0.0**:
	- Convert to Gradle Project (Avillable now on [jCenter](https://bintray.com/falnatsheh/maven/MarkdownView/view)). 
	- Fix CSS Issue (Thanks [@swanson](https://github.com/swanson) & [@echodjb](https://github.com/echodjb)). 
	- Update demo app.  

						
## License
Apache 2.0
