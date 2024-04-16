package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.k17;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationCompatBuilder.java */
/* renamed from: k27  reason: default package */
/* loaded from: classes.dex */
public class k27 implements m07 {
    private final Context a;
    private final Notification.Builder b;
    private final k17.e c;
    private RemoteViews d;
    private RemoteViews e;
    private final List<Bundle> f = new ArrayList();
    private final Bundle g = new Bundle();
    private int h;
    private RemoteViews i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k27(k17.e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> list;
        int i;
        Notification.Builder badgeIconType;
        Notification.Builder settingsText;
        Notification.Builder shortcutId;
        Notification.Builder timeoutAfter;
        Icon icon;
        this.c = eVar;
        this.a = eVar.a;
        if (Build.VERSION.SDK_INT >= 26) {
            w17.a();
            this.b = v17.a(eVar.a, eVar.L);
        } else {
            this.b = new Notification.Builder(eVar.a);
        }
        Notification notification = eVar.S;
        Notification.Builder lights = this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(eVar.e).setContentText(eVar.f).setContentInfo(eVar.k).setContentIntent(eVar.g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = eVar.h;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(eVar.j).setNumber(eVar.l).setProgress(eVar.u, eVar.v, eVar.w);
        this.b.setSubText(eVar.r).setUsesChronometer(eVar.o).setPriority(eVar.m);
        Iterator<k17.a> it = eVar.b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = eVar.E;
        if (bundle != null) {
            this.g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.d = eVar.I;
        this.e = eVar.J;
        this.b.setShowWhen(eVar.n);
        this.b.setLocalOnly(eVar.A).setGroup(eVar.x).setGroupSummary(eVar.y).setSortKey(eVar.z);
        this.h = eVar.P;
        this.b.setCategory(eVar.D).setColor(eVar.F).setVisibility(eVar.G).setPublicVersion(eVar.H).setSound(notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = e(g(eVar.c), eVar.V);
        } else {
            list = eVar.V;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                this.b.addPerson(str);
            }
        }
        this.i = eVar.K;
        if (eVar.d.size() > 0) {
            Bundle bundle2 = eVar.f().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < eVar.d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), l27.a(eVar.d.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.f().putBundle("android.car.EXTENSIONS", bundle2);
            this.g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (icon = eVar.U) != null) {
            this.b.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.b.setExtras(eVar.E).setRemoteInputHistory(eVar.t);
            RemoteViews remoteViews = eVar.I;
            if (remoteViews != null) {
                this.b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.J;
            if (remoteViews2 != null) {
                this.b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.K;
            if (remoteViews3 != null) {
                this.b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            badgeIconType = this.b.setBadgeIconType(eVar.M);
            settingsText = badgeIconType.setSettingsText(eVar.s);
            shortcutId = settingsText.setShortcutId(eVar.N);
            timeoutAfter = shortcutId.setTimeoutAfter(eVar.O);
            timeoutAfter.setGroupAlertBehavior(eVar.P);
            if (eVar.C) {
                this.b.setColorized(eVar.B);
            }
            if (!TextUtils.isEmpty(eVar.L)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<xz7> it2 = eVar.c.iterator();
            while (it2.hasNext()) {
                this.b.addPerson(it2.next().h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(eVar.R);
            this.b.setBubbleMetadata(k17.d.a(null));
        }
        if (i5 >= 31 && (i = eVar.Q) != 0) {
            this.b.setForegroundServiceBehavior(i);
        }
        if (eVar.T) {
            if (this.c.y) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            this.b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.c.x)) {
                    this.b.setGroup("silent");
                }
                this.b.setGroupAlertBehavior(this.h);
            }
        }
    }

    private void b(k17.a aVar) {
        Notification.Action.Builder builder;
        int i;
        Bundle bundle;
        Icon icon;
        int i2 = Build.VERSION.SDK_INT;
        IconCompat d = aVar.d();
        if (i2 >= 23) {
            u17.a();
            if (d != null) {
                icon = d.v();
            } else {
                icon = null;
            }
            builder = t17.a(icon, aVar.h(), aVar.a());
        } else {
            if (d != null) {
                i = d.l();
            } else {
                i = 0;
            }
            builder = new Notification.Action.Builder(i, aVar.h(), aVar.a());
        }
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : nd9.b(aVar.e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (aVar.c() != null) {
            bundle = new Bundle(aVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i3 >= 28) {
            builder.setSemanticAction(aVar.f());
        }
        if (i3 >= 29) {
            builder.setContextual(aVar.j());
        }
        if (i3 >= 31) {
            builder.setAuthenticationRequired(aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        builder.addExtras(bundle);
        this.b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        qr qrVar = new qr(list.size() + list2.size());
        qrVar.addAll(list);
        qrVar.addAll(list2);
        return new ArrayList(qrVar);
    }

    private static List<String> g(List<xz7> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (xz7 xz7Var : list) {
            arrayList.add(xz7Var.g());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // defpackage.m07
    public Notification.Builder a() {
        return this.b;
    }

    public Notification c() {
        RemoteViews remoteViews;
        Bundle b;
        RemoteViews o;
        RemoteViews m;
        k17.g gVar = this.c.q;
        if (gVar != null) {
            gVar.b(this);
        }
        if (gVar != null) {
            remoteViews = gVar.n(this);
        } else {
            remoteViews = null;
        }
        Notification d = d();
        if (remoteViews != null) {
            d.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.c.I;
            if (remoteViews2 != null) {
                d.contentView = remoteViews2;
            }
        }
        if (gVar != null && (m = gVar.m(this)) != null) {
            d.bigContentView = m;
        }
        if (gVar != null && (o = this.c.q.o(this)) != null) {
            d.headsUpContentView = o;
        }
        if (gVar != null && (b = k17.b(d)) != null) {
            gVar.a(b);
        }
        return d;
    }

    protected Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.b.build();
        }
        if (i >= 24) {
            Notification build = this.b.build();
            if (this.h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.h == 2) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.h == 1) {
                    h(build);
                }
            }
            return build;
        }
        this.b.setExtras(this.g);
        Notification build2 = this.b.build();
        RemoteViews remoteViews = this.d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.h != 0) {
            if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.h == 2) {
                h(build2);
            }
            if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.h == 1) {
                h(build2);
            }
        }
        return build2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.a;
    }
}
