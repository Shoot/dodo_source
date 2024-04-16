package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReadWrite.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lhq5;", "Lkotlin/sequences/Sequence;", "", "", "iterator", "Ljava/io/BufferedReader;", "a", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: hq5  reason: default package */
/* loaded from: classes3.dex */
public final class hq5 implements Sequence<String> {
    private final BufferedReader a;

    /* compiled from: ReadWrite.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"hq5$a", "", "", "", "hasNext", "b", "a", "Ljava/lang/String;", "nextValue", "Z", "done", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hq5$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<String>, be5 {
        private String a;
        private boolean b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public String next() {
            if (hasNext()) {
                String str = this.a;
                this.a = null;
                z65.e(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == null && !this.b) {
                String readLine = hq5.this.a.readLine();
                this.a = readLine;
                if (readLine == null) {
                    this.b = true;
                }
            }
            if (this.a != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public hq5(BufferedReader bufferedReader) {
        z65.h(bufferedReader, "reader");
        this.a = bufferedReader;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<String> iterator() {
        return new a();
    }
}
