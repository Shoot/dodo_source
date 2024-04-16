package com.inappstory.sdk.share;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class IASShareManager {
    public static final int SHARE_EVENT = 909;

    private Intent prepareIntent(Context context, IASShareData iASShareData) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        if (iASShareData.getUrl() != null) {
            intent.putExtra("android.intent.extra.TEXT", iASShareData.getUrl());
        }
        List<Uri> urisFromShareData = getUrisFromShareData(context, iASShareData);
        if (urisFromShareData.isEmpty()) {
            intent.setType("text/plain");
        } else {
            intent.addFlags(1);
            intent.setType("image/*");
            if (urisFromShareData.size() > 1) {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(urisFromShareData));
            } else {
                intent.putExtra("android.intent.extra.STREAM", urisFromShareData.get(0));
            }
        }
        return intent;
    }

    private <T extends BroadcastReceiver> void sendIntent(Context context, Intent intent, Class<T> cls) {
        int i;
        Intent createChooser;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, SHARE_EVENT, new Intent(context, (Class<?>) cls), i);
        if (i2 >= 22) {
            createChooser = Intent.createChooser(intent, null, broadcast.getIntentSender());
        } else {
            createChooser = Intent.createChooser(intent, null);
        }
        createChooser.addFlags(268435456);
        context.startActivity(createChooser);
    }

    public List<Uri> getUrisFromShareData(Context context, IASShareData iASShareData) {
        List<String> files = iASShareData.getFiles();
        ArrayList arrayList = new ArrayList();
        for (String str : files) {
            arrayList.add(FileProvider.getUriForFile(context, context.getPackageName() + ".com.inappstory.fileprovider", new File(str)));
        }
        return arrayList;
    }

    public <T extends BroadcastReceiver> void shareDefault(Class<T> cls, Context context, IASShareData iASShareData) {
        sendIntent(context, prepareIntent(context, iASShareData), cls);
    }

    public <T extends BroadcastReceiver> void shareToSpecificApp(Class<T> cls, Context context, IASShareData iASShareData, String str) {
        Intent prepareIntent = prepareIntent(context, iASShareData);
        if (str != null) {
            prepareIntent.setPackage(str);
        }
        sendIntent(context, prepareIntent, cls);
    }
}
