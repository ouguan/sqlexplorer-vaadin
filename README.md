# *This project has been pulled into the https://github.com/JumpMind/symmetricds project*

# Introduction

This library provides a sql explorer component that can be used in Vaadin applications.  This component is used by the Metl and SymmetricDS Pro applications.

# Usage

This library can be found in the JumpMind Maven Repository at http://maven.jumpmind.com/repo.

[DemoUI.java](src/test/java/org/jumpmind/vaadin/ui/sqlexplorer/DemoUI.java) is an example of how to use the Sql Explorer component.

It can be included via gradle or maven.  The following is an example of how it can be included using gradle.  Including this component will require the vaadin widgetset to be compiled as it includes other addons that require widgetset compilation.
```
repositories {
  mavenCentral()    
  jcenter()        
  maven { url "http://maven.vaadin.com/vaadin-addons" }  
  maven { url "http://maven.jumpmind.com/repo" }
}

dependencies {
  compile 'org.jumpmind.vaadin:sqlexplorer-vaadin:1.0.11'
}
```

<p align="center">
  <img src='src/test/screenshots/screenshot2.png?raw=true' />
</p>

<p align="center">
  <img src='src/test/screenshots/screenshot1.png?raw=true' />
</p>


