# Google SwipeRefreshLayout增强版

Google SwipeRefreshLayout增强版，支持上拉下拉加载

源地址 https://github.com/neuyu/refresh，代码做了细节修改

源readme:

swiperefresh的增强版，可以实现上拉加载下拉刷新，也可配置

还在用Android-PullToRefresh,其官方已经DEPRECATED啦，知道google提供的swiperefresh版本吗？

好用到爆

那么问题来了，上拉加载呢？google没提供。。

好了，本库集成了Swiperefresh版本的其他特性，但在其基础上添加了上拉加载功能。


使用和扩展：

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.Blankeer:XSwipeRefreshLayout:1.0.0'
	}

```java
mSwipeRefreshLayout.setDirection(NeuSwipeRefreshLayoutDirection.BOTH);

mSwipeRefreshLayout.setOnRefreshListener(new NeuSwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh(NeuSwipeRefreshLayoutDirection direction) {
                if (direction == NeuSwipeRefreshLayoutDirection.TOP) {
                    mSwipeRefreshLayout.setRefreshing(false);
                } else if (direction == NeuSwipeRefreshLayoutDirection.BOTTOM) {
                    mSwipeRefreshLayout.setRefreshing(false);
                }
            }
        });
```

mSwipeRefreshLayout.autoRefresh();//自动加载
