package com.facebook.flipper.testing;

import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class FlipperConnectionMock implements FlipperConnection {
    public final Map<String, FlipperReceiver> receivers = new HashMap();
    public final Map<String, List<Object>> sent = new HashMap();
    public final List<Throwable> errors = new ArrayList();

    @Override // com.facebook.flipper.core.FlipperConnection
    public void receive(String str, FlipperReceiver flipperReceiver) {
        this.receivers.put(str, flipperReceiver);
    }

    @Override // com.facebook.flipper.core.FlipperConnection
    public void reportError(Throwable th) {
        this.errors.add(th);
    }

    @Override // com.facebook.flipper.core.FlipperConnection
    public void reportErrorWithMetadata(String str, String str2) {
        this.errors.add(new Throwable(str));
    }

    @Override // com.facebook.flipper.core.FlipperConnection
    public void send(String str, FlipperObject flipperObject) {
        List<Object> list;
        if (this.sent.containsKey(str)) {
            list = this.sent.get(str);
        } else {
            ArrayList arrayList = new ArrayList();
            this.sent.put(str, arrayList);
            list = arrayList;
        }
        list.add(flipperObject);
    }

    @Override // com.facebook.flipper.core.FlipperConnection
    public void send(String str, FlipperArray flipperArray) {
        List<Object> list;
        if (this.sent.containsKey(str)) {
            list = this.sent.get(str);
        } else {
            ArrayList arrayList = new ArrayList();
            this.sent.put(str, arrayList);
            list = arrayList;
        }
        list.add(flipperArray);
    }

    @Override // com.facebook.flipper.core.FlipperConnection
    public void send(String str, String str2) {
        List<Object> list;
        if (this.sent.containsKey(str)) {
            list = this.sent.get(str);
        } else {
            ArrayList arrayList = new ArrayList();
            this.sent.put(str, arrayList);
            list = arrayList;
        }
        list.add(str2);
    }
}
