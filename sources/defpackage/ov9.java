package defpackage;

import android.content.Context;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import defpackage.mv9;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ScheduleFormatter.java */
/* renamed from: ov9  reason: default package */
/* loaded from: classes2.dex */
public class ov9 {
    private static final Logger a = LoggerFactory.getLogger("ScheduleFormatter");
    private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm", Locale.getDefault());

    public static String a(mv9 mv9Var, Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Pair> arrayList = new ArrayList();
        for (mv9.a aVar : mv9Var.a()) {
            Pair pair = new Pair(aVar.b(), aVar.c());
            if (arrayList.size() != 0 && ((Pair) ((Pair) arrayList.get(arrayList.size() - 1)).first).equals(pair)) {
                ((List) ((Pair) arrayList.get(arrayList.size() - 1)).second).add(aVar);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(aVar);
                arrayList.add(new Pair(pair, arrayList2));
            }
        }
        if (arrayList.size() > 1) {
            for (Pair pair2 : arrayList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(context.getString(b(((mv9.a) ((List) pair2.second).get(0)).a())));
                if (((List) pair2.second).size() > 1) {
                    Object obj = pair2.second;
                    int b2 = b(((mv9.a) ((List) obj).get(((List) obj).size() - 1)).a());
                    sb2.append(" - ");
                    sb2.append(context.getString(b2));
                }
                sb.append(sb2.toString());
                sb.append(" : ");
                sb.append((String) ((Pair) pair2.first).first);
                sb.append(" - ");
                sb.append((String) ((Pair) pair2.first).second);
                sb.append("\n");
            }
        } else {
            Pair pair3 = (Pair) arrayList.get(0);
            Iterator it = ((List) pair3.second).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((mv9.a) it.next()).d()) {
                        Pair pair4 = (Pair) pair3.first;
                        sb.append(context.getString(o09.everyday, pair4.first, pair4.second));
                        break;
                    }
                } else {
                    sb.append(context.getString(o09.aroundTheClock));
                    break;
                }
            }
        }
        return sb.toString();
    }

    private static int b(int i) {
        switch (i) {
            case 1:
                return o09.sunday;
            case 2:
                return o09.monday;
            case 3:
                return o09.tuesday;
            case 4:
                return o09.wednesday;
            case 5:
                return o09.thursday;
            case 6:
                return o09.friday;
            case 7:
                return o09.saturday;
            default:
                return 0;
        }
    }

    private static mv9.a c(mv9.a aVar, List<mv9.a> list) {
        int indexOf = list.indexOf(aVar) + 1;
        if (indexOf == 7) {
            indexOf = 0;
        }
        return list.get(indexOf);
    }

    private static mv9.a d(mv9.a aVar, List<mv9.a> list) {
        int indexOf = list.indexOf(aVar) - 1;
        if (indexOf == -1) {
            indexOf = 6;
        }
        return list.get(indexOf);
    }

    public static String e(mv9 mv9Var, long j, Context context) {
        StringBuilder sb = new StringBuilder();
        TimeZone timeZone = TimeZone.getDefault();
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setFirstDayOfWeek(2);
        int i = 7;
        int i2 = calendar.get(7) - 1;
        if (i2 != 0) {
            i = i2;
        }
        mv9.a aVar = mv9Var.a().get(i - 1);
        if (aVar.d()) {
            sb.append(context.getString(o09.openAroundTheClock));
        } else {
            try {
                long offset = timeZone.getOffset(15L);
                long g = g(aVar.b(), offset);
                long g2 = g(aVar.c(), offset);
                mv9.a d = d(aVar, mv9Var.a());
                long g3 = g(d.c(), offset);
                long currentTimeMillis = (System.currentTimeMillis() + j) % CoreConstants.MILLIS_IN_ONE_DAY;
                if (g2 < g) {
                    g2 += CoreConstants.MILLIS_IN_ONE_DAY;
                }
                if (currentTimeMillis > g && currentTimeMillis < g2) {
                    sb.append(context.getString(o09.openUntil, aVar.c()));
                } else if (g3 < g && currentTimeMillis < g3) {
                    sb.append(context.getString(o09.openUntil, d.c()));
                } else if (currentTimeMillis > g2) {
                    sb.append(context.getString(o09.closedUntil, c(aVar, mv9Var.a()).b()));
                } else {
                    sb.append(context.getString(o09.closedUntil, aVar.b()));
                }
            } catch (ParseException e) {
                a.error("Some trouble in ScheduleFormatter", (Throwable) e);
            }
        }
        return sb.toString();
    }

    public static boolean f(mv9 mv9Var, long j) {
        TimeZone timeZone = TimeZone.getDefault();
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setFirstDayOfWeek(2);
        int i = 7;
        int i2 = calendar.get(7) - 1;
        if (i2 != 0) {
            i = i2;
        }
        int i3 = i - 1;
        mv9.a aVar = mv9Var.a().get(i3);
        if (aVar.d()) {
            return true;
        }
        try {
            long offset = timeZone.getOffset(15L);
            long g = g(aVar.b(), offset);
            long g2 = g(aVar.c(), offset);
            if (i3 < 0) {
                i3 = 6;
            }
            long g3 = g(mv9Var.a().get(i3).c(), offset);
            long currentTimeMillis = (System.currentTimeMillis() + j) % CoreConstants.MILLIS_IN_ONE_DAY;
            if (g2 < g) {
                g2 += CoreConstants.MILLIS_IN_ONE_DAY;
            }
            if (currentTimeMillis > g && currentTimeMillis < g2) {
                return true;
            }
            if (g3 < g && currentTimeMillis < g3) {
                return true;
            }
            return false;
        } catch (ParseException e) {
            a.error("Some trouble in ScheduleFormatter", (Throwable) e);
            return true;
        }
    }

    private static long g(String str, long j) throws ParseException {
        return b.parse(str).getTime() + j;
    }
}
