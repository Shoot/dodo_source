package defpackage;

import android.database.Cursor;
import cloud.mindbox.mobile_sdk.converters.MindboxRoomConverter;
import cloud.mindbox.mobile_sdk.models.Event;
import cloud.mindbox.mobile_sdk.models.EventType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: EventsDao_Impl.java */
/* renamed from: nl3  reason: default package */
/* loaded from: classes.dex */
public final class nl3 implements ml3 {
    private final un9 a;
    private final dj3<Event> b;
    private final zi3<Event> c;
    private final aia d;
    private final aia e;

    /* compiled from: EventsDao_Impl.java */
    /* renamed from: nl3$a */
    /* loaded from: classes.dex */
    class a extends dj3<Event> {
        a(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "INSERT OR ABORT INTO `mindbox_events_table` (`uid`,`eventType`,`transactionId`,`enqueueTimestamp`,`additionalFields`,`body`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // defpackage.dj3
        /* renamed from: k */
        public void i(c3b c3bVar, Event event) {
            c3bVar.c1(1, event.getUid());
            MindboxRoomConverter mindboxRoomConverter = MindboxRoomConverter.a;
            String a = MindboxRoomConverter.a(event.getEventType());
            if (a == null) {
                c3bVar.z1(2);
            } else {
                c3bVar.L0(2, a);
            }
            if (event.getTransactionId() == null) {
                c3bVar.z1(3);
            } else {
                c3bVar.L0(3, event.getTransactionId());
            }
            c3bVar.c1(4, event.getEnqueueTimestamp());
            String c = MindboxRoomConverter.c(event.getAdditionalFields());
            if (c == null) {
                c3bVar.z1(5);
            } else {
                c3bVar.L0(5, c);
            }
            if (event.getBody() == null) {
                c3bVar.z1(6);
            } else {
                c3bVar.L0(6, event.getBody());
            }
        }
    }

    /* compiled from: EventsDao_Impl.java */
    /* renamed from: nl3$b */
    /* loaded from: classes.dex */
    class b extends zi3<Event> {
        b(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM `mindbox_events_table` WHERE `uid` = ?";
        }

        @Override // defpackage.zi3
        /* renamed from: k */
        public void i(c3b c3bVar, Event event) {
            c3bVar.c1(1, event.getUid());
        }
    }

    /* compiled from: EventsDao_Impl.java */
    /* renamed from: nl3$c */
    /* loaded from: classes.dex */
    class c extends aia {
        c(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM mindbox_events_table WHERE transactionId = ?";
        }
    }

    /* compiled from: EventsDao_Impl.java */
    /* renamed from: nl3$d */
    /* loaded from: classes.dex */
    class d extends aia {
        d(un9 un9Var) {
            super(un9Var);
        }

        @Override // defpackage.aia
        public String e() {
            return "DELETE FROM mindbox_events_table";
        }
    }

    public nl3(un9 un9Var) {
        this.a = un9Var;
        this.b = new a(un9Var);
        this.c = new b(un9Var);
        this.d = new c(un9Var);
        this.e = new d(un9Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    @Override // defpackage.ml3
    public void a(String str) {
        this.a.d();
        c3b b2 = this.d.b();
        if (str == null) {
            b2.z1(1);
        } else {
            b2.L0(1, str);
        }
        this.a.e();
        try {
            b2.I();
            this.a.B();
        } finally {
            this.a.i();
            this.d.h(b2);
        }
    }

    @Override // defpackage.ml3
    public void b() {
        this.a.d();
        c3b b2 = this.e.b();
        this.a.e();
        try {
            b2.I();
            this.a.B();
        } finally {
            this.a.i();
            this.e.h(b2);
        }
    }

    @Override // defpackage.ml3
    public void c(Event event) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(event);
            this.a.B();
        } finally {
            this.a.i();
        }
    }

    @Override // defpackage.ml3
    public void d(List<Event> list) {
        this.a.d();
        this.a.e();
        try {
            this.c.j(list);
            this.a.B();
        } finally {
            this.a.i();
        }
    }

    @Override // defpackage.ml3
    public List<Event> getAll() {
        String string;
        String string2;
        String string3;
        String string4;
        xn9 c2 = xn9.c("SELECT * FROM mindbox_events_table", 0);
        this.a.d();
        this.a.e();
        try {
            Cursor c3 = k62.c(this.a, c2, false, null);
            int e = n32.e(c3, "uid");
            int e2 = n32.e(c3, "eventType");
            int e3 = n32.e(c3, "transactionId");
            int e4 = n32.e(c3, "enqueueTimestamp");
            int e5 = n32.e(c3, "additionalFields");
            int e6 = n32.e(c3, "body");
            ArrayList arrayList = new ArrayList(c3.getCount());
            while (c3.moveToNext()) {
                long j = c3.getLong(e);
                if (c3.isNull(e2)) {
                    string = null;
                } else {
                    string = c3.getString(e2);
                }
                EventType d2 = MindboxRoomConverter.d(string);
                if (c3.isNull(e3)) {
                    string2 = null;
                } else {
                    string2 = c3.getString(e3);
                }
                long j2 = c3.getLong(e4);
                if (c3.isNull(e5)) {
                    string3 = null;
                } else {
                    string3 = c3.getString(e5);
                }
                HashMap<String, String> e7 = MindboxRoomConverter.e(string3);
                if (c3.isNull(e6)) {
                    string4 = null;
                } else {
                    string4 = c3.getString(e6);
                }
                arrayList.add(new Event(j, d2, string2, j2, e7, string4));
            }
            this.a.B();
            c3.close();
            c2.j();
            return arrayList;
        } finally {
            this.a.i();
        }
    }
}
