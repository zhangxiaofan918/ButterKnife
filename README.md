# ButterKnife
View对象绑定---使用注解，findViewById最好的替代者

当代码量很多时，我们还需要根据控件的id去找到控件的对象，也就是findViewById，这样会很麻烦，使用ButterKnife框架可以解决这一问题。

1.添加依赖

在build.gradle(Project:ButterKnife)里加入：

`dependencies { 
    classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
}`

在build.gradle(Module:app)里加入：
`apply plugin: 'android-apt'`

`dependencies {
    apt 'com.jakewharton:butterknife-compiler:8.6.0'
    compile 'com.jakewharton:butterknife:8.6.0'
}`

3.安装插件
搜索Android ButterKnife Zelenzny,安装好以后重启Android Studio

4.在布局文件R.layout.activity_main上右键，选择Generate > Generate Butternife Injections
