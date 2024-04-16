package com.android.volley;

import androidx.annotation.NonNull;
import com.android.volley.Request;
import com.android.volley.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WaitingRequestManager.java */
/* loaded from: classes.dex */
public class g implements Request.NetworkRequestCompleteListener {
    private final lk9 b;
    private final b d;
    private final BlockingQueue<Request<?>> e;
    private final Map<String, List<Request<?>>> a = new HashMap();
    private final e c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(@NonNull b bVar, @NonNull BlockingQueue<Request<?>> blockingQueue, lk9 lk9Var) {
        this.b = lk9Var;
        this.d = bVar;
        this.e = blockingQueue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(Request<?> request) {
        try {
            String cacheKey = request.getCacheKey();
            if (this.a.containsKey(cacheKey)) {
                List<Request<?>> list = this.a.get(cacheKey);
                if (list == null) {
                    list = new ArrayList<>();
                }
                request.addMarker("waiting-for-response");
                list.add(request);
                this.a.put(cacheKey, list);
                if (f.b) {
                    f.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
                }
                return true;
            }
            this.a.put(cacheKey, null);
            request.setNetworkRequestCompleteListener(this);
            if (f.b) {
                f.b("new request, sending to network %s", cacheKey);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public synchronized void onNoUsableResponseReceived(Request<?> request) {
        BlockingQueue<Request<?>> blockingQueue;
        try {
            String cacheKey = request.getCacheKey();
            List<Request<?>> remove = this.a.remove(cacheKey);
            if (remove != null && !remove.isEmpty()) {
                if (f.b) {
                    f.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), cacheKey);
                }
                Request<?> remove2 = remove.remove(0);
                this.a.put(cacheKey, remove);
                remove2.setNetworkRequestCompleteListener(this);
                e eVar = this.c;
                if (eVar != null) {
                    eVar.g(remove2);
                } else if (this.d != null && (blockingQueue = this.e) != null) {
                    try {
                        blockingQueue.put(remove2);
                    } catch (InterruptedException e) {
                        f.c("Couldn't add request to queue. %s", e.toString());
                        Thread.currentThread().interrupt();
                        this.d.d();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.android.volley.Request.NetworkRequestCompleteListener
    public void onResponseReceived(Request<?> request, Response<?> response) {
        List<Request<?>> remove;
        a.C0093a c0093a = response.b;
        if (c0093a != null && !c0093a.a()) {
            String cacheKey = request.getCacheKey();
            synchronized (this) {
                remove = this.a.remove(cacheKey);
            }
            if (remove != null) {
                if (f.b) {
                    f.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), cacheKey);
                }
                for (Request<?> request2 : remove) {
                    this.b.a(request2, response);
                }
                return;
            }
            return;
        }
        onNoUsableResponseReceived(request);
    }
}
