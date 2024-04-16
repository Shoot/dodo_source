package com.inappstory.sdk.stories.utils;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.util.Pair;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.stories.api.models.ImagePlaceholderType;
import com.inappstory.sdk.stories.api.models.ImagePlaceholderValue;
import com.inappstory.sdk.stories.api.models.Story;
import com.inappstory.sdk.stories.cache.Downloader;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import com.inappstory.sdk.utils.ZipLoader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes3.dex */
public class WebPageConverter {
    private String replaceImagePlaceholders(String str, Story story, int i, LruDiskCache lruDiskCache) throws IOException {
        Pair<ImagePlaceholderValue, ImagePlaceholderValue> pair;
        String str2;
        Map<String, Pair<ImagePlaceholderValue, ImagePlaceholderValue>> imagePlaceholdersValuesWithDefaults = InAppStoryService.getInstance().getImagePlaceholdersValuesWithDefaults();
        String str3 = str;
        for (Map.Entry<String, String> entry : story.getPlaceholdersList(i, "image-placeholder").entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null && (pair = imagePlaceholdersValuesWithDefaults.get(value)) != null) {
                ImagePlaceholderType type = ((ImagePlaceholderValue) pair.first).getType();
                ImagePlaceholderType imagePlaceholderType = ImagePlaceholderType.URL;
                if (type == imagePlaceholderType) {
                    String cropUrlOld = Downloader.cropUrlOld(((ImagePlaceholderValue) pair.first).getUrl(), true);
                    File updateFile = Downloader.updateFile(lruDiskCache.getFullFile(cropUrlOld), ((ImagePlaceholderValue) pair.first).getUrl(), lruDiskCache, cropUrlOld);
                    if (updateFile != null && updateFile.exists() && updateFile.length() > 0) {
                        str2 = ZipLoader.FILE + updateFile.getAbsolutePath();
                    } else if (((ImagePlaceholderValue) pair.second).getType() == imagePlaceholderType) {
                        String cropUrlOld2 = Downloader.cropUrlOld(((ImagePlaceholderValue) pair.second).getUrl(), true);
                        File updateFile2 = Downloader.updateFile(lruDiskCache.getFullFile(cropUrlOld2), ((ImagePlaceholderValue) pair.first).getUrl(), lruDiskCache, cropUrlOld2);
                        if (updateFile2 != null && updateFile2.exists() && updateFile2.length() > 0) {
                            str2 = ZipLoader.FILE + updateFile2.getAbsolutePath();
                        }
                    }
                    Log.d("IAS_TAG", "replace placeholder: " + story.id + " " + i + " " + key + " " + str2);
                    str3 = str3.replace(key, str2);
                }
                str2 = "";
                Log.d("IAS_TAG", "replace placeholder: " + story.id + " " + i + " " + key + " " + str2);
                str3 = str3.replace(key, str2);
            }
        }
        return str3;
    }

    private Pair<String, String> replacePlaceholders(String str, String str2) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService != null) {
            Map<String, String> placeholders = inAppStoryService.getPlaceholders();
            for (String str3 : placeholders.keySet()) {
                String str4 = "%" + str3 + "%";
                String str5 = placeholders.get(str3);
                if (str5 != null) {
                    str = str.replace(str4, str5);
                    str2 = str2.replace(str4, str5);
                }
            }
        }
        return new Pair<>(str, str2);
    }

    private String replaceResources(String str, Story story, int i, LruDiskCache lruDiskCache) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(story.getSrcListKeys(i, null));
        arrayList.addAll(story.getSrcListKeys(i, ElementGenerator.TYPE_VIDEO));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(story.getSrcListUrls(i, null));
        arrayList2.addAll(story.getSrcListUrls(i, ElementGenerator.TYPE_VIDEO));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str2 = (String) arrayList2.get(i2);
            String str3 = (String) arrayList.get(i2);
            String cropUrlOld = Downloader.cropUrlOld(str2, true);
            File updateFile = Downloader.updateFile(lruDiskCache.getFullFile(cropUrlOld), str2, lruDiskCache, cropUrlOld);
            if (updateFile != null && updateFile.exists() && updateFile.length() > 0) {
                str2 = ZipLoader.FILE + updateFile.getAbsolutePath();
            }
            str = str.replace(str3, str2);
        }
        return str;
    }

    public Spanned fromHtml(String str) {
        Spanned fromHtml;
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
            return fromHtml;
        }
        return Html.fromHtml(str);
    }

    public void replaceDataAndLoad(String str, Story story, int i, String str2, WebPageConvertCallback webPageConvertCallback) throws IOException {
        if (InAppStoryService.isNotNull()) {
            LruDiskCache commonCache = InAppStoryService.getInstance().getCommonCache();
            Pair<String, String> replacePlaceholders = replacePlaceholders(replaceImagePlaceholders(replaceResources(str, story, i, commonCache), story, i, commonCache), str2);
            str2 = (String) replacePlaceholders.second;
            str = (String) replacePlaceholders.first;
        }
        try {
            webPageConvertCallback.onConvert(str, str2.replace("//_ratio = 0.66666666666,", "").replace("{{%content}}", str), i);
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
        }
    }

    public void replaceEmptyAndLoad(int i, String str, WebPageConvertCallback webPageConvertCallback) {
        try {
            webPageConvertCallback.onConvert("", str.replace("//_ratio = 0.66666666666,", "").replace("{{%content}}", ""), i);
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
        }
    }
}
