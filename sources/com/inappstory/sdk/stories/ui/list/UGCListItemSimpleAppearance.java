package com.inappstory.sdk.stories.ui.list;

import java.io.Serializable;
/* loaded from: classes3.dex */
public class UGCListItemSimpleAppearance implements Serializable {
    Integer backgroundColor;
    Integer iconColor;
    Integer iconId;
    Integer iconMargin;

    public Integer csBackgroundColor() {
        return this.backgroundColor;
    }

    public Integer csIconColor() {
        return this.iconColor;
    }

    public Integer csIconId() {
        return this.iconId;
    }

    public Integer csIconMargin() {
        return this.iconMargin;
    }

    public UGCListItemSimpleAppearance csBackgroundColor(int i) {
        this.backgroundColor = Integer.valueOf(i);
        return this;
    }

    public UGCListItemSimpleAppearance csIconColor(int i) {
        this.iconColor = Integer.valueOf(i);
        return this;
    }

    public UGCListItemSimpleAppearance csIconId(int i) {
        this.iconId = Integer.valueOf(i);
        return this;
    }

    public UGCListItemSimpleAppearance csIconMargin(int i) {
        this.iconMargin = Integer.valueOf(i);
        return this;
    }
}
