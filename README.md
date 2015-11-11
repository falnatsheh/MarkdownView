![MarkdownView screenshot](http://i.imgur.com/EDDSxZK.jpg)

## About

MarkdownView is an Android webview with the capablity of loading Markdown text or file and display it as HTML, it uses MarkdownJ and extends Android webview. 

## Getting started

- To add MarkdownView to your project, include the jar, or the source code. 
- Simple usage is to set the whole activity to a MarkdownView by Adding the following to your onCreate method:

```java
MarkdownView markdownView = new MarkdownView(this);
setContentView(markdownView);
```
 
- Or you can also add it to your layout by using `<us.feras.mdv.MarkdownView android:id="@+id/markdownView" />` 
and reference it in your activity:  

```java
MarkdownView markdownView = (MarkdownView) findViewById(R.id.markdownView);
```

## Loading MarkDown text or file: 

- **loadMarkdown(String text)**
Using this method will result in loading md string to the MarkdownView and displaying it as HTML. 

 
- **loadMarkdownFile(String url)**
You can use this method to load local or online files. 

To load a local file, you have to add it to your assets folder and pass a url that start with "file:///android_asset/" : 

```java
markdownView.loadMarkdownFile("file:///android_asset/myFile.md");
```

To load a file on the web you need to pass the full url :    

```java
markdownView.loadMarkdownFile("http://www.my-site.com/myFile.md");
```

## Theming

You could apply custom CSS to the MarkdownView. Example: 

```java
markdownView.loadMarkdownFile("file:///android_asset/hello.md","file:///android_asset/MyCustomTheme.css");
```
You could take a look at CSS example [here](https://github.com/falnatsheh/MarkdownView/tree/master/MarkdownViewDemo/assets/markdown_css_themes), you could also view them in the sample app.
						
## License
Apache 2.0
