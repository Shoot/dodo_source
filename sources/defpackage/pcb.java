package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* compiled from: ReadWrite.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\u00020\u0000\u001a\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\b\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020\u0000\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¨\u0006\u0012"}, d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "", "action", c.a, "", e.a, "Ljava/io/BufferedReader;", "Lkotlin/sequences/Sequence;", DateTokenConverter.CONVERTER_KEY, "f", "Ljava/io/Writer;", "out", "", "bufferSize", "", "a", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: pcb  reason: default package */
/* loaded from: classes3.dex */
public final class pcb {

    /* compiled from: ReadWrite.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pcb$a */
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function1<String, Unit> {
        final /* synthetic */ ArrayList<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "it");
            this.a.add(str);
        }
    }

    public static final long a(Reader reader, Writer writer, int i) {
        z65.h(reader, "<this>");
        z65.h(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return a(reader, writer, i);
    }

    public static final void c(Reader reader, Function1<? super String, Unit> function1) {
        BufferedReader bufferedReader;
        z65.h(reader, "<this>");
        z65.h(function1, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            for (String str : d(bufferedReader)) {
                function1.invoke(str);
            }
            Unit unit = Unit.a;
            aa1.a(bufferedReader, null);
        } finally {
        }
    }

    public static final Sequence<String> d(BufferedReader bufferedReader) {
        Sequence<String> d;
        z65.h(bufferedReader, "<this>");
        d = bca.d(new hq5(bufferedReader));
        return d;
    }

    public static final List<String> e(Reader reader) {
        z65.h(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        c(reader, new a(arrayList));
        return arrayList;
    }

    public static final String f(Reader reader) {
        z65.h(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        z65.g(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
