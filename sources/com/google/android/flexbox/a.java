package com.google.android.flexbox;

import android.view.View;
import java.util.List;
/* compiled from: FlexContainer.java */
/* loaded from: classes2.dex */
interface a {
    void b(View view, int i, int i2, b bVar);

    int c(int i, int i2, int i3);

    View d(int i);

    int e(int i, int i2, int i3);

    int f(View view);

    void g(b bVar);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<b> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    View h(int i);

    void i(int i, View view);

    int j(View view, int i, int i2);

    boolean k();

    void setFlexLines(List<b> list);
}
