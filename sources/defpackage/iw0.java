package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.text.CharacterIterator;
import kotlin.Metadata;
/* compiled from: CharSequenceCharacterIterator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001d"}, d2 = {"Liw0;", "Ljava/text/CharacterIterator;", "", "first", "last", "current", StatisticManager.NEXT, "previous", "", "position", "setIndex", "getBeginIndex", "getEndIndex", "getIndex", "", "clone", "", "a", "Ljava/lang/CharSequence;", "charSequence", "b", "I", "start", c.a, "end", DateTokenConverter.CONVERTER_KEY, "index", "<init>", "(Ljava/lang/CharSequence;II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: iw0  reason: default package */
/* loaded from: classes.dex */
public final class iw0 implements CharacterIterator {
    private final CharSequence a;
    private final int b;
    private final int c;
    private int d;

    public iw0(CharSequence charSequence, int i, int i2) {
        z65.h(charSequence, "charSequence");
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = i;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            Object clone = super.clone();
            z65.g(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i = this.d;
        if (i == this.c) {
            return (char) 65535;
        }
        return this.a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.d = this.b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            this.d = i2;
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.d = i3;
        return this.a.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i = this.d + 1;
        this.d = i;
        int i2 = this.c;
        if (i >= i2) {
            this.d = i2;
            return (char) 65535;
        }
        return this.a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i = this.d;
        if (i <= this.b) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.d = i2;
        return this.a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i) {
        int i2 = this.b;
        if (i <= this.c && i2 <= i) {
            this.d = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
