package im.threads.business.formatters;

import java.text.DateFormatSymbols;
import kotlin.Metadata;
/* compiled from: RussianFormatSymbols.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lim/threads/business/formatters/RussianFormatSymbols;", "Ljava/text/DateFormatSymbols;", "()V", "russianMonth", "", "", "[Ljava/lang/String;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RussianFormatSymbols extends DateFormatSymbols {
    private final String[] russianMonth;

    public RussianFormatSymbols() {
        String[] strArr = {"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        this.russianMonth = strArr;
        setMonths(strArr);
    }
}
