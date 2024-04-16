package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: Product.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0006¨\u0006&"}, d2 = {"Lfl8;", "Ljava/io/Serializable;", "", DateTokenConverter.CONVERTER_KEY, "n", "getId", "()Ljava/lang/String;", "id", "getName", Action.NAME_ATTRIBUTE, e.a, "category", "f", "description", "b", "allergens", c.a, "allergensCanContain", "Lrl8;", "i", "()Lrl8;", "foodValue", "", "Ltl8;", "j", "()Ljava/util/Collection;", "images", "Lul8;", "k", "ingredients", "Lkm8;", Image.TYPE_MEDIUM, "()Lkm8;", "size", "l", "metaProductId", "<init>", "()V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: fl8  reason: default package */
/* loaded from: classes.dex */
public abstract class fl8 implements Serializable {
    public abstract String b();

    public abstract String c();

    public final String d() {
        String str;
        Object obj;
        Collection<tl8> j = j();
        ArrayList arrayList = new ArrayList(ic1.w(j, 10));
        for (tl8 tl8Var : j) {
            arrayList.add(Integer.valueOf(tl8Var.a()));
        }
        Integer num = (Integer) ic1.n0(arrayList);
        Iterator<T> it = j().iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                int a = ((tl8) obj).a();
                if (num != null && a == num.intValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        tl8 tl8Var2 = (tl8) obj;
        if (tl8Var2 != null) {
            str = tl8Var2.b();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public abstract String e();

    public abstract String f();

    public abstract String getId();

    public abstract String getName();

    public abstract rl8 i();

    public abstract Collection<tl8> j();

    public abstract Collection<ul8> k();

    public abstract String l();

    public abstract km8 m();

    public final String n() {
        Object obj;
        String str;
        Collection<tl8> j = j();
        ArrayList arrayList = new ArrayList(ic1.w(j, 10));
        for (tl8 tl8Var : j) {
            arrayList.add(Integer.valueOf(tl8Var.a()));
        }
        Integer num = (Integer) ic1.m0(ic1.p0(arrayList, 9));
        if (num != null) {
            for (tl8 tl8Var2 : j()) {
                if (tl8Var2.a() == num.intValue()) {
                    return tl8Var2.b();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        Iterator<T> it = j().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((tl8) obj).a() == 9) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        tl8 tl8Var3 = (tl8) obj;
        if (tl8Var3 != null) {
            str = tl8Var3.b();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
