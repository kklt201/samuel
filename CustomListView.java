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
		//getHeight()Ҫ��ؼ��Ѿ���ʾ������
		//height=headerview.getHeight();
		//�ؼ�û����ʾ��������
//�ؼ��ĸ߶����ó���match_parent,wrap_content,60dp
		//UNSPECIFIED ��ָ����С��
		//�����߶�
		headerview.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
		//�õ�������ĸ߶�
		height=headerview.getMeasuredHeight();
		headerview.setPadding(0, -height, 0, 0);
	}

}
