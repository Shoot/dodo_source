package com.inappstory.sdk.inner.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.inappstory.sdk.InAppStoryService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public class FilePathFromBase64 implements Callable<ArrayList<String>> {
    Context context;
    ArrayList<InnerShareFile> shareFiles;

    public FilePathFromBase64(Context context, ArrayList<InnerShareFile> arrayList) {
        this.context = context;
        this.shareFiles = arrayList;
    }

    private String saveImage(Context context, Bitmap bitmap, String str, String str2) {
        Bitmap.CompressFormat compressFormat;
        File file = new File(context.getCacheDir(), "images");
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1487394660:
                if (str2.equals("image/jpeg")) {
                    c = 0;
                    break;
                }
                break;
            case -1487018032:
                if (str2.equals("image/webp")) {
                    c = 1;
                    break;
                }
                break;
            case -879264467:
                if (str2.equals("image/jpg")) {
                    c = 2;
                    break;
                }
                break;
            case -879258763:
                if (str2.equals("image/png")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                compressFormat = Bitmap.CompressFormat.JPEG;
                break;
            case 1:
                compressFormat = Bitmap.CompressFormat.WEBP;
                break;
            case 3:
                compressFormat = Bitmap.CompressFormat.PNG;
                break;
            default:
                return null;
        }
        if (bitmap == null) {
            return null;
        }
        try {
            file.mkdirs();
            File file2 = new File(file, str);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2.getAbsolutePath();
        } catch (IOException e) {
            InAppStoryService.createExceptionLog(e);
            return null;
        }
    }

    public Bitmap getBitmapFromBase64String(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    @Override // java.util.concurrent.Callable
    public ArrayList<String> call() throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<InnerShareFile> it = this.shareFiles.iterator();
        while (it.hasNext()) {
            InnerShareFile next = it.next();
            String saveImage = saveImage(this.context, getBitmapFromBase64String(next.getFile()), next.getName(), next.getType());
            if (saveImage != null) {
                arrayList.add(saveImage);
            }
        }
        return arrayList;
    }
}
