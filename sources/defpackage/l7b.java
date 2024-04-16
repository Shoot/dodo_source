package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TaskStackBuilder.java */
/* renamed from: l7b  reason: default package */
/* loaded from: classes.dex */
public final class l7b implements Iterable<Intent> {
    private final ArrayList<Intent> a = new ArrayList<>();
    private final Context b;

    /* compiled from: TaskStackBuilder.java */
    /* renamed from: l7b$a */
    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private l7b(Context context) {
        this.b = context;
    }

    @NonNull
    public static l7b g(@NonNull Context context) {
        return new l7b(context);
    }

    @NonNull
    public l7b a(@NonNull Intent intent) {
        this.a.add(intent);
        return this;
    }

    @NonNull
    public l7b d(@NonNull Activity activity) {
        Intent intent;
        if (activity instanceof a) {
            intent = ((a) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = ru6.a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.b.getPackageManager());
            }
            f(component);
            a(intent);
        }
        return this;
    }

    @NonNull
    public l7b f(@NonNull ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent b = ru6.b(this.b, componentName);
            while (b != null) {
                this.a.add(size, b);
                b = ru6.b(this.b, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public void h() {
        k(null);
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.a.iterator();
    }

    public void k(Bundle bundle) {
        if (!this.a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!iu1.k(this.b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
