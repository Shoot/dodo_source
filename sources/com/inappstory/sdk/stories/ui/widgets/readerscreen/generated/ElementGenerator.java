package com.inappstory.sdk.stories.ui.widgets.readerscreen.generated;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.imageloader.ImageLoader;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.StoryLink;
import com.inappstory.sdk.stories.api.models.StoryLinkObject;
import com.inappstory.sdk.stories.api.models.slidestructure.Background;
import com.inappstory.sdk.stories.api.models.slidestructure.Border;
import com.inappstory.sdk.stories.api.models.slidestructure.Element;
import com.inappstory.sdk.stories.api.models.slidestructure.Geometry;
import com.inappstory.sdk.stories.api.models.slidestructure.Source;
import com.inappstory.sdk.stories.api.models.slidestructure.Thumbnail;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class ElementGenerator {
    static final String PROD_PRE_PATH = "https://cs2.kiozk.ru/file/";
    static final String TEST_PRE_PATH = "https://cs.test.inappstory.com/np/file/";
    public static final String TEXT_ALIGN_CENTER = "center";
    public static final String TEXT_ALIGN_JUSTIFY = "justify";
    public static final String TEXT_ALIGN_LEFT = "left";
    public static final String TEXT_ALIGN_RIGHT = "right";
    public static final String TYPE_IMAGE = "image";
    public static final String TYPE_LINK = "link";
    public static final String TYPE_TEXT = "text";
    public static final String TYPE_TEXT_LINK = "text-link";
    public static final String TYPE_VIDEO = "video";
    public static String prePath = "https://cs.test.inappstory.com/np/file/";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a implements View.OnClickListener {
        final /* synthetic */ Element a;
        final /* synthetic */ SimpleViewCallback b;

        a(Element element, SimpleViewCallback simpleViewCallback) {
            this.a = element;
            this.b = simpleViewCallback;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Element element = this.a;
            try {
                this.b.doAction(JsonParser.getJson(new StoryLinkObject(ElementGenerator.TYPE_LINK, new StoryLink(element.linkType, element.linkTarget))));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static GeneratedView generate(Element element, Context context, int i, int i2) {
        String str = element.type;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1083981670:
                if (str.equals(TYPE_TEXT_LINK)) {
                    c = 0;
                    break;
                }
                break;
            case 3321850:
                if (str.equals(TYPE_LINK)) {
                    c = 1;
                    break;
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    c = 2;
                    break;
                }
                break;
            case 100313435:
                if (str.equals(TYPE_IMAGE)) {
                    c = 3;
                    break;
                }
                break;
            case 112202875:
                if (str.equals(TYPE_VIDEO)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return new GeneratedView(element.type, generateLink(element, context, i, i2));
            case 2:
                return new GeneratedView(element.type, generateText(element, context, i, i2));
            case 3:
                return new GeneratedView(element.type, generateImage(element, context, i, i2));
            case 4:
                return new GeneratedView(element.type, generateVideo(element, context, i, i2));
            default:
                return null;
        }
    }

    static GeneratedImageView generateImage(Element element, Context context, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        GeneratedImageView generatedImageView = new GeneratedImageView(context);
        generatedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (element.geometry.expand) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        } else {
            float f = i2;
            Geometry geometry = element.geometry;
            float f2 = i;
            layoutParams = new RelativeLayout.LayoutParams((int) ((geometry.width / 100.0f) * f), (int) ((geometry.height / 100.0f) * f2));
            Geometry geometry2 = element.geometry;
            layoutParams.setMargins((int) ((geometry2.x / 100.0f) * f), (int) ((geometry2.y / 100.0f) * f2), 0, 0);
        }
        generatedImageView.setLayoutParams(layoutParams);
        Float f3 = element.opacity;
        if (f3 != null) {
            generatedImageView.setAlpha(f3.floatValue());
        }
        return generatedImageView;
    }

    static AppCompatTextView generateLink(Element element, Context context, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        GeneratedTextView generatedTextView = new GeneratedTextView(context);
        int i3 = 0;
        generatedTextView.setTextColor(ColorParser.getColor(element.color, false));
        generatedTextView.setTextSize(0, element.textSize * GeneratedViewSizes.getEMInPx());
        CharSequence charSequence = element.content;
        if (charSequence != null) {
            generatedTextView.setText(charSequence);
        }
        char c = 65535;
        if (element.geometry.expand) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        } else {
            float f = i2;
            layoutParams = new RelativeLayout.LayoutParams((int) ((element.geometry.width / 100.0f) * f), -2);
            Geometry geometry = element.geometry;
            layoutParams.setMargins((int) ((geometry.x / 100.0f) * f), (int) ((geometry.y / 100.0f) * i), 0, 0);
        }
        float f2 = i2;
        int i4 = (int) ((element.padding * f2) / 20.0f);
        generatedTextView.setPadding(i4, i4, i4, i4);
        if (element.border != null || element.background != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            Border border = element.border;
            if (border != null) {
                gradientDrawable.setCornerRadius((border.radius * f2) / 20.0f);
                Border border2 = element.border;
                float f3 = border2.width;
                if (f3 > 0.0f) {
                    gradientDrawable.setStroke((int) ((f2 * f3) / 20.0f), ColorParser.getColor(border2.color, false));
                }
            }
            Background background = element.background;
            if (background != null) {
                gradientDrawable.setColor(ColorParser.getColor(background.color, false));
            }
            generatedTextView.setBackground(gradientDrawable);
        }
        generatedTextView.setTextAlignment(1);
        String str = element.align;
        str.hashCode();
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TEXT_ALIGN_CENTER)) {
                    c = 0;
                    break;
                }
                break;
            case -1249482096:
                if (str.equals(TEXT_ALIGN_JUSTIFY)) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TEXT_ALIGN_LEFT)) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TEXT_ALIGN_RIGHT)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                generatedTextView.setGravity(17);
                break;
            case 1:
            case 2:
                generatedTextView.setGravity(19);
                break;
            case 3:
                generatedTextView.setGravity(21);
                break;
        }
        generatedTextView.setLayoutParams(layoutParams);
        Typeface font = AppearanceManager.getCommonInstance().getFont(element.secondaryFont, element.bold, element.italic);
        boolean z = element.bold;
        if (element.italic) {
            i3 = 2;
        }
        if (font == null) {
            font = generatedTextView.getTypeface();
        }
        generatedTextView.setTypeface(font, (z ? 1 : 0) + i3);
        return generatedTextView;
    }

    static AppCompatTextView generateText(Element element, Context context, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        GeneratedTextView generatedTextView = new GeneratedTextView(context);
        int i3 = 0;
        generatedTextView.setTextColor(ColorParser.getColor(element.color, false));
        generatedTextView.setTextSize(0, element.textSize * GeneratedViewSizes.getEMInPx());
        CharSequence charSequence = element.content;
        if (charSequence != null) {
            generatedTextView.setText(charSequence);
        }
        char c = 65535;
        if (element.geometry.expand) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        } else {
            float f = i2;
            layoutParams = new RelativeLayout.LayoutParams((int) ((element.geometry.width / 100.0f) * f), -2);
            Geometry geometry = element.geometry;
            layoutParams.setMargins((int) ((geometry.x / 100.0f) * f), (int) ((geometry.y / 100.0f) * i), 0, 0);
        }
        float f2 = i2;
        int i4 = (int) ((element.padding * f2) / 20.0f);
        generatedTextView.setPadding(i4, i4, i4, i4);
        if (element.border != null || element.background != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            Border border = element.border;
            if (border != null) {
                gradientDrawable.setCornerRadius((border.radius * f2) / 20.0f);
                Border border2 = element.border;
                float f3 = border2.width;
                if (f3 > 0.0f) {
                    gradientDrawable.setStroke((int) ((f2 * f3) / 20.0f), ColorParser.getColor(border2.color, false));
                }
            }
            Background background = element.background;
            if (background != null) {
                gradientDrawable.setColor(ColorParser.getColor(background.color, false));
            }
            generatedTextView.setBackground(gradientDrawable);
        }
        generatedTextView.setTextAlignment(1);
        String str = element.align;
        str.hashCode();
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TEXT_ALIGN_CENTER)) {
                    c = 0;
                    break;
                }
                break;
            case -1249482096:
                if (str.equals(TEXT_ALIGN_JUSTIFY)) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TEXT_ALIGN_LEFT)) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TEXT_ALIGN_RIGHT)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                generatedTextView.setGravity(17);
                break;
            case 1:
            case 2:
                generatedTextView.setGravity(19);
                break;
            case 3:
                generatedTextView.setGravity(21);
                break;
        }
        generatedTextView.setLayoutParams(layoutParams);
        Typeface font = AppearanceManager.getCommonInstance().getFont(element.secondaryFont, element.bold, element.italic);
        boolean z = element.bold;
        if (element.italic) {
            i3 = 2;
        }
        if (font == null) {
            font = generatedTextView.getTypeface();
        }
        generatedTextView.setTypeface(font, (z ? 1 : 0) + i3);
        return generatedTextView;
    }

    static GeneratedVideoView generateVideo(Element element, Context context, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        GeneratedVideoView generatedVideoView = new GeneratedVideoView(context);
        if (element.geometry.expand) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        } else {
            float f = i2;
            Geometry geometry = element.geometry;
            float f2 = i;
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) ((geometry.width / 100.0f) * f), (int) ((geometry.height / 100.0f) * f2));
            Geometry geometry2 = element.geometry;
            layoutParams2.setMargins((int) ((geometry2.x / 100.0f) * f), (int) ((geometry2.y / 100.0f) * f2), 0, 0);
            layoutParams = layoutParams2;
        }
        generatedVideoView.setLayoutParams(layoutParams);
        return generatedVideoView;
    }

    public static void loadContent(Element element, GeneratedView generatedView, SimpleViewCallback simpleViewCallback, String str) {
        String str2 = element.type;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1083981670:
                if (str2.equals(TYPE_TEXT_LINK)) {
                    c = 0;
                    break;
                }
                break;
            case 3321850:
                if (str2.equals(TYPE_LINK)) {
                    c = 1;
                    break;
                }
                break;
            case 3556653:
                if (str2.equals("text")) {
                    c = 2;
                    break;
                }
                break;
            case 100313435:
                if (str2.equals(TYPE_IMAGE)) {
                    c = 3;
                    break;
                }
                break;
            case 112202875:
                if (str2.equals(TYPE_VIDEO)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                loadLink(element, generatedView, simpleViewCallback);
                return;
            case 2:
                loadText(element, generatedView);
                return;
            case 3:
                loadImage(element, generatedView, str);
                return;
            case 4:
                loadVideo(element, generatedView, str);
                return;
            default:
                return;
        }
    }

    static void loadImage(Element element, GeneratedView generatedView, String str) {
        File file;
        String str2 = element.path;
        ArrayList<Source> arrayList = element.sources;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Source> it = element.sources.iterator();
            while (it.hasNext()) {
                Source next = it.next();
                if (next.type.contains("webp")) {
                    str2 = next.path;
                }
            }
        }
        try {
            LruDiskCache commonCache = InAppStoryService.getInstance().getCommonCache();
            file = commonCache.getFullFile(prePath + str2);
        } catch (Exception e) {
            e.printStackTrace();
            file = null;
        }
        if (file == null) {
            ImageLoader imageLoader = ImageLoader.getInstance();
            imageLoader.displayImage(prePath + str2, -1, (GeneratedImageView) generatedView.view, InAppStoryService.getInstance().getCommonCache());
            return;
        }
        ((GeneratedImageView) generatedView.view).setImageBitmap(BitmapFactory.decodeFile(file.getAbsolutePath(), new BitmapFactory.Options()));
        ((GeneratedImageView) generatedView.view).onLoaded();
    }

    static void loadLink(Element element, GeneratedView generatedView, SimpleViewCallback simpleViewCallback) {
        generatedView.view.setOnClickListener(new a(element, simpleViewCallback));
    }

    static void loadVideo(Element element, GeneratedView generatedView, String str) {
        Thumbnail thumbnail = element.thumbnail;
        if (thumbnail != null && thumbnail.path != null) {
            ((GeneratedVideoView) generatedView.view).loadCover(prePath + element.thumbnail.path);
        }
        ArrayList<Source> arrayList = element.sources;
        if (arrayList != null && arrayList.size() > 0) {
            ((GeneratedVideoView) generatedView.view).loadVideo(prePath + element.sources.get(0).path, str);
        }
    }

    static void loadText(Element element, GeneratedView generatedView) {
    }
}
