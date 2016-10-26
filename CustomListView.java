package com.tarena.costomlistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class CustomListView extends ListView {
	View headerview;
	int height;

	public CustomListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		headerview = View.inflate(context, R.layout.listview_header, null);
		this.addHeaderView(headerview);
		//getHeight()要求控件已经显示出来了
		//height=headerview.getHeight();
		//控件没有显示出来，用
//控件的高度设置成了match_parent,wrap_content,60dp
		//UNSPECIFIED 不指定大小。
		//测量高度
		headerview.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
		//得到测量后的高度
		height=headerview.getMeasuredHeight();
		headerview.setPadding(0, -height, 0, 0);
	}

}
