package com.facebook.flipper.plugins.inspector;

import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import java.util.List;
/* loaded from: classes2.dex */
public class SearchResultNode {
    private final FlipperObject axElement;
    private final List<SearchResultNode> children;
    private final FlipperObject element;
    private final String id;
    private final boolean isMatch;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SearchResultNode(String str, boolean z, FlipperObject flipperObject, List<SearchResultNode> list, FlipperObject flipperObject2) {
        this.id = str;
        this.isMatch = z;
        this.element = flipperObject;
        this.children = list;
        this.axElement = flipperObject2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlipperObject toFlipperObject() {
        FlipperArray flipperArray;
        if (this.children != null) {
            FlipperArray.Builder builder = new FlipperArray.Builder();
            for (SearchResultNode searchResultNode : this.children) {
                builder.put(searchResultNode.toFlipperObject());
            }
            flipperArray = builder.build();
        } else {
            flipperArray = null;
        }
        return new FlipperObject.Builder().put("id", this.id).put("isMatch", Boolean.valueOf(this.isMatch)).put("axElement", this.axElement).put("element", this.element).put("children", flipperArray).build();
    }
}
