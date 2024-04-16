package com.inappstory.sdk.stories.api.models.slidestructure;

import com.inappstory.sdk.network.SerializedName;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class Element {
    public String align;
    public boolean animated = true;
    public Animation animation;
    public Background background;
    public String blurred;
    public boolean bold;
    public Border border;
    public String color;
    public String content;
    public Geometry geometry;
    public float height;
    public String id;
    public int inTemplateIndex;
    public boolean italic;
    public float lineHeight;
    public String linkTarget;
    public String linkType;
    public boolean newPadding;
    public Float opacity;
    public float padding;
    public String path;
    public boolean secondaryFont;
    public float size;
    public ArrayList<Source> sources;
    @SerializedName("strikethrough")
    public boolean strikeThrough;
    public boolean stroke;
    public float textSize;
    public Thumbnail thumbnail;
    public String type;
    public boolean underline;
    public float width;
}
