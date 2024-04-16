package com.inappstory.sdk.listwidget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.R;
import com.inappstory.sdk.WidgetAppearance;
import com.inappstory.sdk.imageloader.ImageLoader;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.statistic.SharedPreferencesAPI;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public class StoriesWidgetFactory implements RemoteViewsService.RemoteViewsFactory {
    private int mAppWidgetId;
    private Context mContext;
    List<Story> mWidgetItems = new ArrayList();
    HashMap<String, SoftReference<Bitmap>> bmps = new HashMap<>();

    public StoriesWidgetFactory(Context context, Intent intent) {
        this.mContext = context;
        this.mAppWidgetId = intent.getIntExtra("appWidgetId", 0);
        setStories();
        if (ImageLoader.getInstance() == null) {
            new ImageLoader(this.mContext);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getCount() {
        return this.mWidgetItems.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public RemoteViews getViewAt(int i) {
        Float ratio;
        Float ratio2;
        if (ImageLoader.getInstance() == null) {
            new ImageLoader(this.mContext);
        }
        if (this.bmps == null) {
            this.bmps = new HashMap<>();
        }
        Context context = this.mContext;
        int i2 = R.layout.cs_widget_grid_item;
        Float f = null;
        View inflate = View.inflate(context, i2, null);
        RemoteViews remoteViews = new RemoteViews(this.mContext.getPackageName(), i2);
        int i3 = R.id.title;
        remoteViews.setTextViewText(i3, this.mWidgetItems.get(i).getTitle());
        View findViewById = inflate.findViewById(R.id.container);
        View findViewById2 = inflate.findViewById(i3);
        int i4 = R.id.image;
        View findViewById3 = inflate.findViewById(i4);
        if (findViewById != null && findViewById.getLayoutParams() != null && findViewById.getLayoutParams().width > 0) {
            f = Float.valueOf(findViewById.getLayoutParams().width / (findViewById.getLayoutParams().height * 1.0f));
        }
        WidgetAppearance csWidgetAppearance = AppearanceManager.csWidgetAppearance();
        if (csWidgetAppearance.getWidgetClass() == null) {
            if (!SharedPreferencesAPI.hasContext()) {
                SharedPreferencesAPI.setContext(this.mContext);
            }
            csWidgetAppearance = (WidgetAppearance) JsonParser.fromJson(SharedPreferencesAPI.getString("lastWidgetAppearance"), WidgetAppearance.class);
            if (csWidgetAppearance == null) {
                csWidgetAppearance = AppearanceManager.csWidgetAppearance();
            } else if (csWidgetAppearance.getRatio() == null || (f != null && f != csWidgetAppearance.getRatio())) {
                csWidgetAppearance.setRatio(f);
                csWidgetAppearance.save();
            }
        }
        if (findViewById2 != null && csWidgetAppearance.getTextColor() != null) {
            remoteViews.setTextColor(i3, csWidgetAppearance.getTextColor().intValue());
        }
        if (findViewById3 != null) {
            try {
                if (this.mWidgetItems.get(i).getImage() != null) {
                    ImageLoader imageLoader = ImageLoader.getInstance();
                    String url = this.mWidgetItems.get(i).getImage().get(0).getUrl();
                    Integer corners = csWidgetAppearance.getCorners();
                    if (f != null) {
                        ratio2 = f;
                    } else {
                        ratio2 = csWidgetAppearance.getRatio();
                    }
                    imageLoader.displayRemoteImage(url, 0, remoteViews, i4, corners, ratio2, this.mContext);
                } else {
                    ImageLoader imageLoader2 = ImageLoader.getInstance();
                    String str = this.mWidgetItems.get(i).backgroundColor;
                    Integer corners2 = csWidgetAppearance.getCorners();
                    if (f != null) {
                        ratio = f;
                    } else {
                        ratio = csWidgetAppearance.getRatio();
                    }
                    imageLoader2.displayRemoteColor(str, 0, remoteViews, i4, corners2, ratio, this.mContext);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Intent intent = new Intent();
        intent.putExtra(StoriesWidgetService.POSITION, i);
        intent.putExtra(StoriesWidgetService.ID, this.mWidgetItems.get(i).id);
        if (findViewById != null) {
            remoteViews.setOnClickFillInIntent(R.id.container, intent);
        }
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public int getViewTypeCount() {
        return this.mWidgetItems.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public boolean hasStableIds() {
        return true;
    }

    public void refreshData() {
        setStories();
    }

    public void setStories() {
        if (!SharedPreferencesAPI.hasContext()) {
            SharedPreferencesAPI.setContext(this.mContext);
        }
        if (SharedPreferencesAPI.getString("widgetStories") != null) {
            this.mWidgetItems = JsonParser.listFromJson(SharedPreferencesAPI.getString("widgetStories"), Story.class);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onCreate() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDataSetChanged() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public void onDestroy() {
    }
}
