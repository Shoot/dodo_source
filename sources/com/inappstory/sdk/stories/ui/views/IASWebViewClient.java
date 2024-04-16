package com.inappstory.sdk.stories.ui.views;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.lrudiskcache.LruDiskCache;
import com.inappstory.sdk.stories.cache.Downloader;
import com.inappstory.sdk.utils.ZipLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes3.dex */
public class IASWebViewClient extends WebViewClient {
    public static void copyFile(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    private File getCachedFile(String str, String str2) {
        InAppStoryService inAppStoryService = InAppStoryService.getInstance();
        if (inAppStoryService == null) {
            return null;
        }
        LruDiskCache commonCache = inAppStoryService.getCommonCache();
        try {
            return Downloader.updateFile(commonCache.getFullFile(str2), str, commonCache, str2);
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
            return null;
        }
    }

    private File getFileByUrl(String str) {
        String str2;
        if (str.startsWith("http://file-assets")) {
            str2 = Uri.parse(str.replace("http://file-assets", ZipLoader.FILE)).getPath();
        } else if (str.startsWith(ZipLoader.FILE)) {
            str2 = Uri.parse(str).getPath();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return new File(str2);
        }
        if (str.startsWith("data:") || !URLUtil.isValidUrl(str)) {
            return null;
        }
        return getCachedFile(str, Downloader.cropUrlOld(str, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: Exception -> 0x0064, TryCatch #1 {Exception -> 0x0064, blocks: (B:16:0x0058, B:18:0x005e, B:21:0x0067), top: B:27:0x0058 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.webkit.WebResourceResponse getChangedResponse(java.lang.String r6) throws java.io.FileNotFoundException {
        /*
            r5 = this;
            java.io.File r0 = r5.getFileByUrl(r6)
            r1 = 0
            if (r0 == 0) goto L7b
            boolean r2 = r0.exists()
            if (r2 == 0) goto L7b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "web view replace: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " "
            r2.append(r6)
            java.lang.String r6 = r0.getAbsolutePath()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r2 = "IAS_TAG"
            android.util.Log.d(r2, r6)
            android.webkit.MimeTypeMap r6 = android.webkit.MimeTypeMap.getSingleton()     // Catch: java.lang.Exception -> L48
            java.lang.String r2 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L48
            java.lang.String r2 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r2)     // Catch: java.lang.Exception -> L48
            java.lang.String r6 = r6.getMimeTypeFromExtension(r2)     // Catch: java.lang.Exception -> L48
            if (r6 == 0) goto L4a
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Exception -> L48
            if (r2 == 0) goto L4c
            goto L4a
        L48:
            r6 = move-exception
            goto L78
        L4a:
            java.lang.String r6 = "application/octet-stream"
        L4c:
            android.webkit.WebResourceResponse r2 = new android.webkit.WebResourceResponse     // Catch: java.lang.Exception -> L48
            java.lang.String r3 = "BINARY"
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L48
            r4.<init>(r0)     // Catch: java.lang.Exception -> L48
            r2.<init>(r6, r3, r4)     // Catch: java.lang.Exception -> L48
            java.util.Map r6 = r2.getResponseHeaders()     // Catch: java.lang.Exception -> L64
            if (r6 != 0) goto L67
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Exception -> L64
            r6.<init>()     // Catch: java.lang.Exception -> L64
            goto L67
        L64:
            r6 = move-exception
            r1 = r2
            goto L78
        L67:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Exception -> L64
            r0.<init>(r6)     // Catch: java.lang.Exception -> L64
            java.lang.String r6 = "Access-Control-Allow-Origin"
            java.lang.String r1 = "*"
            r0.put(r6, r1)     // Catch: java.lang.Exception -> L64
            r2.setResponseHeaders(r0)     // Catch: java.lang.Exception -> L64
            r1 = r2
            goto L7b
        L78:
            com.inappstory.sdk.InAppStoryService.createExceptionLog(r6)
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inappstory.sdk.stories.ui.views.IASWebViewClient.getChangedResponse(java.lang.String):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            WebResourceResponse changedResponse = getChangedResponse(webResourceRequest.getUrl().toString());
            if (changedResponse != null) {
                return changedResponse;
            }
        } catch (FileNotFoundException unused) {
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            WebResourceResponse changedResponse = getChangedResponse(str);
            if (changedResponse != null) {
                return changedResponse;
            }
        } catch (FileNotFoundException unused) {
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
