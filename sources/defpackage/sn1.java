package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bz7;
import defpackage.e99;
import defpackage.qi4;
import im.threads.ui.fragments.ChatFragment;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: V
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0002\u008d\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004©\u0001«\u0001B¤\u0001\u0012\u000b\u0010Ò\u0001\u001a\u0006\u0012\u0002\b\u00030^\u0012\b\u0010Ô\u0001\u001a\u00030º\u0001\u0012\b\u0010×\u0001\u001a\u00030Õ\u0001\u0012\u000f\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u0001\u0012.\u0010ß\u0001\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`a0Ý\u0001\u0012.\u0010á\u0001\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`a0Ý\u0001\u0012\u0007\u0010å\u0001\u001a\u00020L¢\u0006\u0006\bÛ\u0002\u0010Ü\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002J9\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0017H\u0002J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010'\u001a\u00020\u0002H\u0002J\u0010\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002J(\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0002J\u0010\u00100\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0018\u00102\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J\b\u00103\u001a\u00020\u0002H\u0002J \u00107\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006H\u0002J\u0018\u00109\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002J \u0010;\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0014\u0010=\u001a\u00020\u0006*\u00020<2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010>\u001a\u00020\u0002H\u0002J\b\u0010?\u001a\u00020\u0002H\u0002J2\u0010E\u001a\u00020\u00022\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0@2\u0006\u0010B\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010\t2\u0006\u0010D\u001a\u00020\u0017H\u0002J$\u0010J\u001a\u00020\u00022\u001a\u0010I\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020H\u0012\u0006\u0012\u0004\u0018\u00010H0G0FH\u0002Jk\u0010T\u001a\u00028\u0000\"\u0004\b\u0000\u0010K2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\"\b\u0002\u0010Q\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020O\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010P0G0F2\f\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000RH\u0002¢\u0006\u0004\bT\u0010UJ;\u0010X\u001a\u00020\u00022\u001a\u0010W\u001a\u0016\u0012\u0004\u0012\u00020O\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010P0V2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010RH\u0002¢\u0006\u0004\bX\u0010YJ\u0016\u0010Z\u001a\u0004\u0018\u00010\t*\u00020<2\u0006\u0010(\u001a\u00020\u0006H\u0002J\b\u0010[\u001a\u00020\u0002H\u0002J\b\u0010\\\u001a\u00020\u0002H\u0002J0\u0010c\u001a\u00020\u00022&\u0010b\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`aH\u0002J0\u0010d\u001a\u00020\u00022&\u0010b\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`aH\u0002J0\u0010e\u001a\u00020\u00022&\u0010b\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`aH\u0002J:\u0010g\u001a\u00020\u00022\b\b\u0002\u0010f\u001a\u00020\u00172&\u0010b\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`aH\u0002J\b\u0010h\u001a\u00020\u0002H\u0002J\u001f\u0010k\u001a\u00020\u00022\u000e\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0iH\u0002¢\u0006\u0004\bk\u0010lJ\b\u0010m\u001a\u00020\u0002H\u0002J\u0012\u0010o\u001a\u00020\u00022\b\u0010n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010p\u001a\u00020\u0002H\u0002J\u0012\u0010q\u001a\u00020\u00022\b\b\u0002\u0010f\u001a\u00020\u0017H\u0002J\u0010\u0010t\u001a\u00020\u00022\u0006\u0010s\u001a\u00020rH\u0002J0\u0010u\u001a\u00020\u00022&\u0010b\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`aH\u0002J0\u0010v\u001a\u00020\u00022&\u0010b\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`aH\u0002J\b\u0010w\u001a\u00020\u0002H\u0002J\b\u0010x\u001a\u00020\u0002H\u0002J\u0010\u0010z\u001a\u00020\u00022\u0006\u0010y\u001a\u00020\u0006H\u0002J\u0018\u0010}\u001a\u00020\u00022\u0006\u0010{\u001a\u00020H2\u0006\u0010|\u001a\u00020_H\u0002J\b\u0010~\u001a\u00020\u0002H\u0002J\u0011\u0010\u0080\u0001\u001a\u00020\u00022\u0006\u0010\u007f\u001a\u00020\u0006H\u0002J\t\u0010\u0081\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0082\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0083\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0084\u0001\u001a\u00020\u0002H\u0002J\t\u0010\u0085\u0001\u001a\u00020\u0002H\u0002J\u001a\u0010\u0087\u0001\u001a\u00020\u00022\u0007\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J!\u0010\u0088\u0001\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J\t\u0010\u0089\u0001\u001a\u00020\u0002H\u0002J&\u0010\u008b\u0001\u001a\u00020\u00022\u0007\u0010\u008a\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u008d\u0001\u001a\u00020\u00022\u0007\u0010\u008c\u0001\u001a\u00020\u0006H\u0002J&\u0010\u008e\u0001\u001a\u00020\u00022\u0007\u0010\u008a\u0001\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u008f\u0001\u001a\u00020\u00022\u0007\u0010\u008a\u0001\u001a\u00020\u0006H\u0002J\u0011\u0010\u0090\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\t\u0010\u0091\u0001\u001a\u00020\u0002H\u0017J\t\u0010\u0092\u0001\u001a\u00020\u0002H\u0017J\t\u0010\u0093\u0001\u001a\u00020\u0002H\u0017J\u001b\u0010\u0094\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J\t\u0010\u0095\u0001\u001a\u00020\u0002H\u0017J\u0012\u0010\u0096\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\t\u0010\u0098\u0001\u001a\u00020\u0002H\u0016J\u0012\u0010\u0099\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u0097\u0001J\t\u0010\u009a\u0001\u001a\u00020\u0002H\u0016J\t\u0010\u009b\u0001\u001a\u00020\u0002H\u0016J\u001f\u0010\u009e\u0001\u001a\u00020\u0002\"\u0005\b\u0000\u0010\u009c\u00012\r\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000RH\u0016J\t\u0010\u009f\u0001\u001a\u00020\u0002H\u0016J\t\u0010 \u0001\u001a\u00020\u0002H\u0016JD\u0010¤\u0001\u001a\u00020\u0002\"\u0005\b\u0000\u0010¡\u0001\"\u0005\b\u0001\u0010\u009c\u00012\u0007\u0010¢\u0001\u001a\u00028\u00002\u0019\u0010S\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020£\u0001H\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u000b\u0010¦\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0014\u0010§\u0001\u001a\u00020\u00172\t\u0010¢\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u0014\u0010¨\u0001\u001a\u00020\u00172\t\u0010¢\u0001\u001a\u0004\u0018\u00010\tH\u0017J\u0012\u0010©\u0001\u001a\u00020\u00172\u0007\u0010¢\u0001\u001a\u00020\u0017H\u0017J\u0013\u0010«\u0001\u001a\u00020\u00172\b\u0010¢\u0001\u001a\u00030ª\u0001H\u0017J\u0013\u0010\u00ad\u0001\u001a\u00020\u00172\b\u0010¢\u0001\u001a\u00030¬\u0001H\u0017J\u0012\u0010®\u0001\u001a\u00020\u00172\u0007\u0010¢\u0001\u001a\u00020\u0006H\u0017J\u0014\u0010¯\u0001\u001a\u00020\u00022\t\u0010¢\u0001\u001a\u0004\u0018\u00010\tH\u0001J\u0018\u0010±\u0001\u001a\u00020\u00022\r\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020RH\u0016J(\u0010´\u0001\u001a\u00020\u00022\u0014\u0010³\u0001\u001a\u000f\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030²\u00010iH\u0017¢\u0006\u0006\b´\u0001\u0010µ\u0001J\t\u0010¶\u0001\u001a\u00020\u0002H\u0017J(\u0010¸\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u009c\u00012\r\u0010\u0007\u001a\t\u0012\u0004\u0012\u00028\u00000·\u0001H\u0017¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\n\u0010»\u0001\u001a\u00030º\u0001H\u0016J&\u0010¾\u0001\u001a\u00020\u00172\u0007\u0010¼\u0001\u001a\u00020O2\t\u0010½\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\t\u0010À\u0001\u001a\u00020\u0002H\u0017J\t\u0010Á\u0001\u001a\u00020\u0002H\u0017J\u0011\u0010Â\u0001\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\f\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u0001H\u0017J%\u0010Å\u0001\u001a\u00020\u00022\u001a\u0010I\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020H\u0012\u0006\u0012\u0004\u0018\u00010H0G0FH\u0017J;\u0010Æ\u0001\u001a\u00020\u00022\u001a\u0010W\u001a\u0016\u0012\u0004\u0012\u00020O\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010P0V2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020RH\u0000¢\u0006\u0005\bÆ\u0001\u0010YJ \u0010Ç\u0001\u001a\u00020\u00022\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00020RH\u0000¢\u0006\u0006\bÇ\u0001\u0010È\u0001J.\u0010É\u0001\u001a\u00020\u00172\u001a\u0010W\u001a\u0016\u0012\u0004\u0012\u00020O\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010P0VH\u0000¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u000b\u0010Ë\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u0010Ì\u0001\u001a\u00020\u00022\t\u0010¢\u0001\u001a\u0004\u0018\u00010\tH\u0016J\u0013\u0010Î\u0001\u001a\u00020\u00022\b\u0010¼\u0001\u001a\u00030Í\u0001H\u0016R#\u0010Ò\u0001\u001a\u0006\u0012\u0002\b\u00030^8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ô\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010Ó\u0001R\u0018\u0010×\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010Ö\u0001R\u001f\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Ù\u00010Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R@\u0010ß\u0001\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`a0Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Þ\u0001R@\u0010á\u0001\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`a0Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010Þ\u0001R\u001f\u0010å\u0001\u001a\u00020L8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÐ\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001R \u0010è\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010 0æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010ç\u0001R\u001b\u0010ê\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010é\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010»\u0001R\u001a\u0010í\u0001\u001a\u00030ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010ì\u0001R\u0019\u0010ï\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010»\u0001R\u001a\u0010ñ\u0001\u001a\u00030ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ì\u0001R\u001c\u0010ô\u0001\u001a\u0005\u0018\u00010ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010ó\u0001R;\u0010ø\u0001\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010õ\u0001j\u0011\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`ö\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010÷\u0001R\u0019\u0010ú\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010ù\u0001R\u0019\u0010û\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010ù\u0001R\u0019\u0010ü\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010ù\u0001R\u001e\u0010Q\u001a\n\u0012\u0005\u0012\u00030ý\u00010Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010Þ\u0001R\u0018\u0010þ\u0001\u001a\u00030ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010ì\u0001R\u0019\u0010\u0081\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u001e\u0010\u0084\u0002\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0082\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0083\u0002R\u0019\u0010\u0085\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010ù\u0001R\u0018\u0010\u0087\u0002\u001a\u00030ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010ì\u0001R\u0019\u0010\u0088\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010ù\u0001R\u0019\u0010\u0089\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010»\u0001R\u0019\u0010\u008a\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010»\u0001R\u0019\u0010\u008b\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010»\u0001R\u0019\u0010\u008c\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010ù\u0001R\u0018\u0010\u008f\u0002\u001a\u00030\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010\u008e\u0002R\u001e\u0010\u0090\u0002\u001a\t\u0012\u0004\u0012\u00020O0æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010ç\u0001R*\u0010\u0095\u0002\u001a\u00020\u00172\u0007\u0010\u0091\u0002\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0092\u0002\u0010ù\u0001\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R*\u0010\u0098\u0002\u001a\u00020\u00172\u0007\u0010\u0091\u0002\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0096\u0002\u0010ù\u0001\u001a\u0006\b\u0097\u0002\u0010\u0094\u0002R\u0019\u0010\u009a\u0002\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010\u0099\u0002R*\u0010\u009f\u0002\u001a\u00030Õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010Ö\u0001\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0019\u0010¡\u0002\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010 \u0002R\u0018\u0010¢\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0005\u0010ù\u0001R\u001b\u0010¤\u0002\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0002\u0010\u0080\u0002RR\u0010ª\u0002\u001a+\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`a\u0018\u00010Ý\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¥\u0002\u0010Þ\u0001\u001a\u0006\b¦\u0002\u0010§\u0002\"\u0006\b¨\u0002\u0010©\u0002R\u0019\u0010\u00ad\u0002\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R>\u0010¯\u0002\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`a0Ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0002\u0010Þ\u0001R1\u0010$\u001a\u00020\u00172\u0007\u0010\u0091\u0002\u001a\u00020\u00178\u0016@RX\u0097\u000e¢\u0006\u0018\n\u0006\b°\u0002\u0010ù\u0001\u0012\u0006\b±\u0002\u0010\u0097\u0001\u001a\u0006\bÚ\u0001\u0010\u0094\u0002R1\u0010´\u0002\u001a\u00020\u00062\u0007\u0010\u0091\u0002\u001a\u00020\u00068\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0005\bK\u0010»\u0001\u0012\u0006\b³\u0002\u0010\u0097\u0001\u001a\u0006\b\u0096\u0002\u0010²\u0002R\u0019\u0010¶\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010»\u0001R\"\u0010·\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010ç\u0001R\u0019\u0010¹\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0002\u0010»\u0001R\u0019\u0010º\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010ù\u0001R\u0019\u0010¼\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0002\u0010ù\u0001R\u0018\u0010¾\u0002\u001a\u00030ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010ì\u0001R>\u0010À\u0002\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00020]j\u0002`a0æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0002\u0010ç\u0001R\u0019\u0010Á\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010»\u0001R\u0018\u0010Â\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010»\u0001R\u0019\u0010Ã\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010»\u0001R\u0019\u0010Ä\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010»\u0001R\u001c\u0010n\u001a\u0004\u0018\u00010\t*\u00020<8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010Æ\u0002R\u0017\u0010È\u0002\u001a\u00020\u00178@X\u0080\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010\u0094\u0002R\u0018\u0010Ë\u0002\u001a\u00030É\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bî\u0001\u0010Ê\u0002R\u001f\u0010Í\u0002\u001a\u00020\u00178VX\u0097\u0004¢\u0006\u0010\u0012\u0006\bÌ\u0002\u0010\u0097\u0001\u001a\u0006\b\u0092\u0002\u0010\u0094\u0002R\u001f\u0010Ï\u0002\u001a\u00020\u00178VX\u0097\u0004¢\u0006\u0010\u0012\u0006\bÎ\u0002\u0010\u0097\u0001\u001a\u0006\bà\u0001\u0010\u0094\u0002R\u0018\u0010Ò\u0002\u001a\u00030Ð\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010Ñ\u0002R\u0018\u0010Õ\u0002\u001a\u00030Ó\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010Ô\u0002R\u0019\u0010Ø\u0002\u001a\u0004\u0018\u00010O8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÖ\u0002\u0010×\u0002R\u001a\u0010Ú\u0002\u001a\u0005\u0018\u00010Í\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÿ\u0001\u0010Ù\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Ý\u0002"}, d2 = {"Lsn1;", "Lqn1;", "", "B1", "p0", "L", "", Action.KEY_ATTRIBUTE, "x1", "", "dataKey", "y1", "n0", "u1", "Lbz7;", "h0", "group", "i0", "parentScope", "currentProviders", "J1", "q0", "g0", "", "isNode", "data", "A1", "objectKey", "Lqi4;", "kind", "w1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "Lqx7;", "newPending", "r0", "expectedNodeCount", "inserting", "s0", "m0", "V0", "index", "F0", "newCount", "I1", "groupLocation", "recomposeGroup", "recomposeIndex", "K0", "L1", "count", "H1", "d0", "oldGroup", "newGroup", "commonRoot", "n1", "nearestCommonRoot", "l0", "recomposeKey", "f0", "Lvna;", "z0", "v1", "a0", "Lfp6;", RemoteMessageConst.Notification.CONTENT, "locals", "parameter", "force", "G0", "", "Lkotlin/Pair;", "Lhp6;", "references", "A0", "R", "Ljv1;", RemoteMessageConst.FROM, RemoteMessageConst.TO, "Le99;", "Llt4;", "invalidations", "Lkotlin/Function0;", "block", "T0", "(Ljv1;Ljv1;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkt4;", "invalidationsRequested", "k0", "(Lkt4;Lkotlin/jvm/functions/Function2;)V", "J0", "M1", "N1", "Lkotlin/Function3;", "Lwp;", "Lzna;", "Lwc9;", "Landroidx/compose/runtime/Change;", "change", "W0", "X0", "j1", "forParent", "k1", "R0", "", "nodes", "N0", "([Ljava/lang/Object;)V", "M0", "node", "Z0", "m1", "P0", "Lrd;", "anchor", "d1", "c1", "e1", "o1", "Y0", "groupBeingRemoved", "r1", "reference", "slots", "p1", "q1", "location", "g1", "i1", "a1", "b1", "t0", "c0", "nodeIndex", "h1", "f1", "O0", "groupKey", "D1", "keyHash", "E1", "F1", "G1", "w", "J", "A", Image.TYPE_SMALL, "z1", "o0", "b0", "()V", "u", "j0", "j", "B", "T", "factory", "D", "o", "r", "V", "value", "Lkotlin/Function2;", "l", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "I0", "K", "z", "a", "", "b", "", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.opendevice.c.a, "K1", "effect", "t", "Lzr8;", "values", "q", "([Lzr8;)V", "F", "Llo1;", "k", "(Llo1;)Ljava/lang/Object;", "Ldo1;", "I", Action.SCOPE_ATTRIBUTE, "instance", "C1", "(Le99;Ljava/lang/Object;)Z", "t1", "E", "f", "Lxw9;", "i", "E0", "e0", "L0", "(Lkotlin/jvm/functions/Function0;)V", "S0", "(Lkt4;)Z", "x", "p", "Ld99;", "C", "Lwp;", Image.TYPE_HIGH, "()Lwp;", "applier", "Ldo1;", "parentContext", "Lwna;", "Lwna;", "slotTable", "", "Lxc9;", com.huawei.hms.push.e.a, "Ljava/util/Set;", "abandonSet", "", "Ljava/util/List;", "changes", "g", "lateChanges", "Ljv1;", "v0", "()Ljv1;", "composition", "Lqsa;", "Lqsa;", "pendingStack", "Lqx7;", "pending", "Lz55;", "Lz55;", "nodeIndexStack", Image.TYPE_MEDIUM, "groupNodeCount", "n", "groupNodeCountStack", "", "[I", "nodeCountOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "nodeCountVirtualOverrides", "Z", "forceRecomposeScopes", "forciblyRecompose", "nodeExpected", "Lh75;", "entersStack", "v", "Lbz7;", "parentProvider", "Lr55;", "Lr55;", "providerUpdates", "providersInvalid", "y", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "sourceInformationEnabled", "sn1$f", "Lsn1$f;", "derivedStateObserver", "invalidateStack", "<set-?>", "G", "H0", "()Z", "isComposing", "H", "isDisposed$runtime_release", "isDisposed", "Lvna;", "reader", "getInsertTable$runtime_release", "()Lwna;", "setInsertTable$runtime_release", "(Lwna;)V", "insertTable", "Lzna;", "writer", "writerHasAProvider", "M", "providerCache", "N", "x0", "()Ljava/util/List;", "setDeferredChanges$runtime_release", "(Ljava/util/List;)V", "deferredChanges", "O", "Lrd;", "insertAnchor", "P", "insertFixups", "Q", "getInserting$annotations", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "S", "pendingUps", "downNodes", "U", "writersReaderDelta", "startedGroup", "W", "implicitRootStart", "X", "startedGroups", "Y", "insertUpFixups", "previousRemove", "previousMoveFrom", "previousMoveTo", "previousCount", "y0", "(Lvna;)Ljava/lang/Object;", "u0", "areChildrenComposing", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "Lfo1;", "()Lfo1;", "compositionData", "Lpo1;", "()Lpo1;", "currentCompositionLocalMap", "w0", "()Le99;", "currentRecomposeScope", "()Ld99;", "recomposeScope", "<init>", "(Lwp;Ldo1;Lwna;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Ljv1;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sn1  reason: default package */
/* loaded from: classes.dex */
public final class sn1 implements qn1 {
    private int A;
    private int B;
    private int C;
    private boolean D;
    private final f E;
    private final qsa<e99> F;
    private boolean G;
    private boolean H;
    private vna I;
    private wna J;
    private zna K;
    private boolean L;
    private bz7 M;
    private List<y84<wp<?>, zna, wc9, Unit>> N;
    private rd O;
    private final List<y84<wp<?>, zna, wc9, Unit>> P;
    private boolean Q;
    private int R;
    private int S;
    private qsa<Object> T;
    private int U;
    private boolean V;
    private boolean W;
    private final z55 X;
    private final qsa<y84<wp<?>, zna, wc9, Unit>> Y;
    private int Z;
    private int a0;
    private final wp<?> b;
    private int b0;
    private final do1 c;
    private int c0;
    private final wna d;
    private final Set<xc9> e;
    private List<y84<wp<?>, zna, wc9, Unit>> f;
    private List<y84<wp<?>, zna, wc9, Unit>> g;
    private final jv1 h;
    private final qsa<qx7> i;
    private qx7 j;
    private int k;
    private z55 l;
    private int m;
    private z55 n;
    private int[] o;
    private HashMap<Integer, Integer> p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final List<h75> t;
    private final z55 u;
    private bz7 v;
    private final r55<bz7> w;
    private boolean x;
    private final z55 y;
    private boolean z;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"sn1$a0", "Lg99;", "Le99;", Action.SCOPE_ATTRIBUTE, "", "instance", "Lj75;", DateTokenConverter.CONVERTER_KEY, "", Image.TYPE_SMALL, "value", "b", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sn1$a0 */
    /* loaded from: classes.dex */
    public static final class a0 implements g99 {
        final /* synthetic */ jv1 a;
        final /* synthetic */ hp6 b;

        a0(jv1 jv1Var, hp6 hp6Var) {
            this.a = jv1Var;
            this.b = hp6Var;
        }

        @Override // defpackage.g99
        public void b(Object obj) {
            z65.h(obj, "value");
        }

        @Override // defpackage.g99
        public j75 d(e99 e99Var, Object obj) {
            g99 g99Var;
            j75 j75Var;
            List<Pair<e99, lt4<Object>>> r0;
            z65.h(e99Var, Action.SCOPE_ATTRIBUTE);
            jv1 jv1Var = this.a;
            lt4 lt4Var = null;
            if (jv1Var instanceof g99) {
                g99Var = (g99) jv1Var;
            } else {
                g99Var = null;
            }
            if (g99Var == null || (j75Var = g99Var.d(e99Var, obj)) == null) {
                j75Var = j75.IGNORED;
            }
            if (j75Var == j75.IGNORED) {
                hp6 hp6Var = this.b;
                List<Pair<e99, lt4<Object>>> d = hp6Var.d();
                if (obj != null) {
                    lt4Var = new lt4();
                    lt4Var.add(lt4Var);
                }
                r0 = sc1.r0(d, lnb.a(e99Var, lt4Var));
                hp6Var.h(r0);
                return j75.SCHEDULED;
            }
            return j75Var;
        }

        @Override // defpackage.g99
        public void s(e99 e99Var) {
            z65.h(e99Var, Action.SCOPE_ATTRIBUTE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010/\u001a\u00020+\u0012\u0006\u00104\u001a\u000200¢\u0006\u0004\bG\u0010HJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012J\u001d\u0010\u001a\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0010¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0010¢\u0006\u0004\b#\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020\u001fH\u0010¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010'\u001a\u00020$H\u0010¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b*\u0010\fR\u001a\u0010/\u001a\u00020+8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001a\u00104\u001a\u0002008\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b2\u00103R0\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u001bR\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00178\u0006¢\u0006\f\n\u0004\b2\u00105\u001a\u0004\b;\u00107R+\u0010B\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010>\u001a\u0004\b?\u0010\u0014\"\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lsn1$b;", "Ldo1;", "", "r", "Lqn1;", "composer", Image.TYPE_MEDIUM, "(Lqn1;)V", "p", "Ljv1;", "composition", "q", "(Ljv1;)V", "Lkotlin/Function0;", RemoteMessageConst.Notification.CONTENT, "a", "(Ljv1;Lkotlin/jvm/functions/Function2;)V", "i", "Lbz7;", com.huawei.hms.push.e.a, "()Lbz7;", Action.SCOPE_ATTRIBUTE, "v", "", "Lfo1;", "table", "l", "(Ljava/util/Set;)V", "o", "()V", com.huawei.hms.opendevice.c.a, "Lhp6;", "reference", Image.TYPE_HIGH, "(Lhp6;)V", "b", "Lgp6;", "k", "(Lhp6;)Lgp6;", "data", "j", "(Lhp6;Lgp6;)V", "n", "", "I", "f", "()I", "compoundHashKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "collectingParameterInformation", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "Lsn1;", Image.TYPE_SMALL, "composers", "<set-?>", "Ler6;", "t", "u", "(Lbz7;)V", "compositionLocalScope", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lsn1;IZ)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sn1$b */
    /* loaded from: classes.dex */
    public final class b extends do1 {
        private final int a;
        private final boolean b;
        private Set<Set<fo1>> c;
        private final Set<sn1> d = new LinkedHashSet();
        private final er6 e;

        public b(int i, boolean z) {
            er6 c;
            this.a = i;
            this.b = z;
            c = tpa.c(cz7.a(), null, 2, null);
            this.e = c;
        }

        private final bz7 t() {
            return (bz7) this.e.getValue();
        }

        private final void u(bz7 bz7Var) {
            this.e.setValue(bz7Var);
        }

        @Override // defpackage.do1
        public void a(jv1 jv1Var, Function2<? super qn1, ? super Integer, Unit> function2) {
            z65.h(jv1Var, "composition");
            z65.h(function2, RemoteMessageConst.Notification.CONTENT);
            sn1.this.c.a(jv1Var, function2);
        }

        @Override // defpackage.do1
        public void b(hp6 hp6Var) {
            z65.h(hp6Var, "reference");
            sn1.this.c.b(hp6Var);
        }

        @Override // defpackage.do1
        public void c() {
            sn1 sn1Var = sn1.this;
            sn1Var.B--;
        }

        @Override // defpackage.do1
        public boolean d() {
            return this.b;
        }

        @Override // defpackage.do1
        public bz7 e() {
            return t();
        }

        @Override // defpackage.do1
        public int f() {
            return this.a;
        }

        @Override // defpackage.do1
        public CoroutineContext g() {
            return sn1.this.c.g();
        }

        @Override // defpackage.do1
        public void h(hp6 hp6Var) {
            z65.h(hp6Var, "reference");
            sn1.this.c.h(hp6Var);
        }

        @Override // defpackage.do1
        public void i(jv1 jv1Var) {
            z65.h(jv1Var, "composition");
            sn1.this.c.i(sn1.this.v0());
            sn1.this.c.i(jv1Var);
        }

        @Override // defpackage.do1
        public void j(hp6 hp6Var, gp6 gp6Var) {
            z65.h(hp6Var, "reference");
            z65.h(gp6Var, "data");
            sn1.this.c.j(hp6Var, gp6Var);
        }

        @Override // defpackage.do1
        public gp6 k(hp6 hp6Var) {
            z65.h(hp6Var, "reference");
            return sn1.this.c.k(hp6Var);
        }

        @Override // defpackage.do1
        public void l(Set<fo1> set) {
            z65.h(set, "table");
            Set set2 = this.c;
            if (set2 == null) {
                set2 = new HashSet();
                this.c = set2;
            }
            set2.add(set);
        }

        @Override // defpackage.do1
        public void m(qn1 qn1Var) {
            z65.h(qn1Var, "composer");
            super.m((sn1) qn1Var);
            this.d.add(qn1Var);
        }

        @Override // defpackage.do1
        public void n(jv1 jv1Var) {
            z65.h(jv1Var, "composition");
            sn1.this.c.n(jv1Var);
        }

        @Override // defpackage.do1
        public void o() {
            sn1.this.B++;
        }

        @Override // defpackage.do1
        public void p(qn1 qn1Var) {
            z65.h(qn1Var, "composer");
            Set<Set<fo1>> set = this.c;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((sn1) qn1Var).d);
                }
            }
            unb.a(this.d).remove(qn1Var);
        }

        @Override // defpackage.do1
        public void q(jv1 jv1Var) {
            z65.h(jv1Var, "composition");
            sn1.this.c.q(jv1Var);
        }

        public final void r() {
            if (!this.d.isEmpty()) {
                Set<Set<fo1>> set = this.c;
                if (set != null) {
                    for (sn1 sn1Var : this.d) {
                        for (Set<fo1> set2 : set) {
                            set2.remove(sn1Var.d);
                        }
                    }
                }
                this.d.clear();
            }
        }

        public final Set<sn1> s() {
            return this.d;
        }

        public final void v(bz7 bz7Var) {
            z65.h(bz7Var, Action.SCOPE_ATTRIBUTE);
            u(bz7Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$b0 */
    /* loaded from: classes.dex */
    public static final class b0 extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ hp6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(hp6 hp6Var) {
            super(3);
            this.b = hp6Var;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            sn1.this.p1(this.b, znaVar);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"V", "T", "Lwp;", "applier", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ Function2<T, V, Unit> a;
        final /* synthetic */ V b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super T, ? super V, Unit> function2, V v) {
            super(3);
            this.a = function2;
            this.b = v;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "<anonymous parameter 2>");
            this.a.invoke(wpVar.b(), this.b);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$c0 */
    /* loaded from: classes.dex */
    public static final class c0 extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(int i) {
            super(3);
            this.a = i;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            znaVar.q0(this.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "Lwp;", "applier", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ Function0<T> a;
        final /* synthetic */ rd b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<? extends T> function0, rd rdVar, int i) {
            super(3);
            this.a = function0;
            this.b = rdVar;
            this.c = i;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            Object invoke = this.a.invoke();
            znaVar.e1(this.b, invoke);
            wpVar.d(this.c, invoke);
            wpVar.g(invoke);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbz7;", "a", "(Lqn1;I)Lbz7;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$d0 */
    /* loaded from: classes.dex */
    static final class d0 extends ej5 implements Function2<qn1, Integer, bz7> {
        final /* synthetic */ zr8<?>[] a;
        final /* synthetic */ bz7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(zr8<?>[] zr8VarArr, bz7 bz7Var) {
            super(2);
            this.a = zr8VarArr;
            this.b = bz7Var;
        }

        public final bz7 a(qn1 qn1Var, int i) {
            qn1Var.w(-948105361);
            if (tn1.K()) {
                tn1.V(-948105361, i, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:1994)");
            }
            bz7 a = qo1.a(this.a, this.b, qn1Var, 8);
            if (tn1.K()) {
                tn1.U();
            }
            qn1Var.J();
            return a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ bz7 invoke(qn1 qn1Var, Integer num) {
            return a(qn1Var, num.intValue());
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "Lwp;", "applier", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ rd a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(rd rdVar, int i) {
            super(3);
            this.a = rdVar;
            this.b = i;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            Object w0 = znaVar.w0(this.a);
            wpVar.i();
            wpVar.f(this.b, w0);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$e0 */
    /* loaded from: classes.dex */
    public static final class e0 extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(Object obj) {
            super(3);
            this.a = obj;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            znaVar.a1(this.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u0006\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"sn1$f", "Lu03;", "Lt03;", "derivedState", "", "a", "b", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sn1$f */
    /* loaded from: classes.dex */
    public static final class f implements u03 {
        final /* synthetic */ sn1 a;

        f(sn1 sn1Var) {
            this.a = sn1Var;
        }

        @Override // defpackage.u03
        public void a(t03<?> t03Var) {
            z65.h(t03Var, "derivedState");
            this.a.B++;
        }

        @Override // defpackage.u03
        public void b(t03<?> t03Var) {
            z65.h(t03Var, "derivedState");
            sn1 sn1Var = this.a;
            sn1Var.B--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "rememberManager", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$f0 */
    /* loaded from: classes.dex */
    public static final class f0 extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(Object obj) {
            super(3);
            this.a = obj;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "rememberManager");
            wc9Var.c((xc9) this.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$g */
    /* loaded from: classes.dex */
    public static final class g<T> implements Comparator {
        public g() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((h75) t).b()), Integer.valueOf(((h75) t2).b()));
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "rememberManager", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$g0 */
    /* loaded from: classes.dex */
    public static final class g0 extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ Object a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(Object obj, int i) {
            super(3);
            this.a = obj;
            this.b = i;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "rememberManager");
            Object obj = this.a;
            if (obj instanceof xc9) {
                wc9Var.c((xc9) obj);
            }
            Object L0 = znaVar.L0(this.b, this.a);
            if (L0 instanceof xc9) {
                wc9Var.d((xc9) L0);
            } else if (L0 instanceof e99) {
                ((e99) L0).w();
            }
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ Function1<co1, Unit> a;
        final /* synthetic */ sn1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Function1<? super co1, Unit> function1, sn1 sn1Var) {
            super(3);
            this.a = function1;
            this.b = sn1Var;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "<anonymous parameter 2>");
            this.a.invoke(this.b.v0());
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$h0 */
    /* loaded from: classes.dex */
    static final class h0 extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        public static final h0 a = new h0();

        static {
        }

        h0() {
            super(3);
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "<anonymous parameter 2>");
            Object b = wpVar.b();
            z65.f(b, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((kn1) b).e();
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$i */
    /* loaded from: classes.dex */
    public static final class i extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ ca9 a;
        final /* synthetic */ rd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ca9 ca9Var, rd rdVar) {
            super(3);
            this.a = ca9Var;
            this.b = rdVar;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            this.a.a = sn1.C0(znaVar, this.b, wpVar);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: sn1$j */
    /* loaded from: classes.dex */
    public static final class j extends ej5 implements Function0<Unit> {
        final /* synthetic */ sn1 a;
        final /* synthetic */ List<y84<wp<?>, zna, wc9, Unit>> b;
        final /* synthetic */ vna c;
        final /* synthetic */ hp6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(sn1 sn1Var, List<y84<wp<?>, zna, wc9, Unit>> list, vna vnaVar, hp6 hp6Var) {
            super(0);
            this.a = sn1Var;
            this.b = list;
            this.c = vnaVar;
            this.d = hp6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            sn1 sn1Var = this.a;
            List<y84<wp<?>, zna, wc9, Unit>> list = this.b;
            vna vnaVar = this.c;
            hp6 hp6Var = this.d;
            List list2 = sn1Var.f;
            try {
                sn1Var.f = list;
                vna vnaVar2 = sn1Var.I;
                int[] iArr = sn1Var.o;
                sn1Var.o = null;
                sn1Var.I = vnaVar;
                sn1Var.G0(hp6Var.c(), hp6Var.e(), hp6Var.f(), true);
                Unit unit = Unit.a;
                sn1Var.I = vnaVar2;
                sn1Var.o = iArr;
            } finally {
                sn1Var.f = list2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "slots", "Lwc9;", "rememberManager", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$k */
    /* loaded from: classes.dex */
    public static final class k extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ ca9 a;
        final /* synthetic */ List<y84<wp<?>, zna, wc9, Unit>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ca9 ca9Var, List<y84<wp<?>, zna, wc9, Unit>> list) {
            super(3);
            this.a = ca9Var;
            this.b = list;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "rememberManager");
            int i = this.a.a;
            if (i > 0) {
                wpVar = new t67(wpVar, i);
            }
            List<y84<wp<?>, zna, wc9, Unit>> list = this.b;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).invoke(wpVar, znaVar, wc9Var);
            }
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$l */
    /* loaded from: classes.dex */
    public static final class l extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ ca9 a;
        final /* synthetic */ List<Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ca9 ca9Var, List<? extends Object> list) {
            super(3);
            this.a = ca9Var;
            this.b = list;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "<anonymous parameter 2>");
            int i = this.a.a;
            List<Object> list = this.b;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                wpVar.f(i3, obj);
                wpVar.d(i3, obj);
            }
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$m */
    /* loaded from: classes.dex */
    public static final class m extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ gp6 a;
        final /* synthetic */ sn1 b;
        final /* synthetic */ hp6 c;
        final /* synthetic */ hp6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(gp6 gp6Var, sn1 sn1Var, hp6 hp6Var, hp6 hp6Var2) {
            super(3);
            this.a = gp6Var;
            this.b = sn1Var;
            this.c = hp6Var;
            this.d = hp6Var2;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            gp6 gp6Var = this.a;
            if (gp6Var == null && (gp6Var = this.b.c.k(this.c)) == null) {
                tn1.w("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<rd> s0 = znaVar.s0(1, gp6Var.a(), 2);
            e99.a aVar = e99.h;
            jv1 b = this.d.b();
            z65.f(b, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            aVar.a(znaVar, s0, (g99) b);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: sn1$n */
    /* loaded from: classes.dex */
    public static final class n extends ej5 implements Function0<Unit> {
        final /* synthetic */ sn1 a;
        final /* synthetic */ hp6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(sn1 sn1Var, hp6 hp6Var) {
            super(0);
            this.a = sn1Var;
            this.b = hp6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.G0(this.b.c(), this.b.e(), this.b.f(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "slots", "Lwc9;", "rememberManager", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$o */
    /* loaded from: classes.dex */
    public static final class o extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ ca9 a;
        final /* synthetic */ List<y84<wp<?>, zna, wc9, Unit>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(ca9 ca9Var, List<y84<wp<?>, zna, wc9, Unit>> list) {
            super(3);
            this.a = ca9Var;
            this.b = list;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "rememberManager");
            int i = this.a.a;
            if (i > 0) {
                wpVar = new t67(wpVar, i);
            }
            List<y84<wp<?>, zna, wc9, Unit>> list = this.b;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).invoke(wpVar, znaVar, wc9Var);
            }
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$p */
    /* loaded from: classes.dex */
    public static final class p extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        public static final p a = new p();

        static {
        }

        p() {
            super(3);
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            sn1.D0(znaVar, wpVar, 0);
            znaVar.O();
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$q */
    /* loaded from: classes.dex */
    public static final class q extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ fp6<Object> a;
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(fp6<Object> fp6Var, Object obj) {
            super(2);
            this.a = fp6Var;
            this.b = obj;
        }

        public final void a(qn1 qn1Var, int i) {
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(316014703, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2946)");
            }
            this.a.a().invoke(this.b, qn1Var, 8);
            if (tn1.K()) {
                tn1.U();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$r */
    /* loaded from: classes.dex */
    public static final class r extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ Object[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(Object[] objArr) {
            super(3);
            this.a = objArr;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "<anonymous parameter 2>");
            int length = this.a.length;
            for (int i = 0; i < length; i++) {
                wpVar.g(this.a[i]);
            }
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$s */
    /* loaded from: classes.dex */
    public static final class s extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(int i, int i2) {
            super(3);
            this.a = i;
            this.b = i2;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "<anonymous parameter 2>");
            wpVar.a(this.a, this.b);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$t */
    /* loaded from: classes.dex */
    public static final class t extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i, int i2, int i3) {
            super(3);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "<anonymous parameter 2>");
            wpVar.c(this.a, this.b, this.c);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$u */
    /* loaded from: classes.dex */
    public static final class u extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i) {
            super(3);
            this.a = i;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            znaVar.z(this.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$v */
    /* loaded from: classes.dex */
    public static final class v extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(int i) {
            super(3);
            this.a = i;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "<anonymous parameter 2>");
            int i = this.a;
            for (int i2 = 0; i2 < i; i2++) {
                wpVar.i();
            }
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$w */
    /* loaded from: classes.dex */
    public static final class w extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ wna a;
        final /* synthetic */ rd b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(wna wnaVar, rd rdVar) {
            super(3);
            this.a = wnaVar;
            this.b = rdVar;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            znaVar.D();
            wna wnaVar = this.a;
            znaVar.p0(wnaVar, this.b.d(wnaVar), false);
            znaVar.P();
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "applier", "Lzna;", "slots", "Lwc9;", "rememberManager", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$x */
    /* loaded from: classes.dex */
    public static final class x extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ wna a;
        final /* synthetic */ rd b;
        final /* synthetic */ List<y84<wp<?>, zna, wc9, Unit>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(wna wnaVar, rd rdVar, List<y84<wp<?>, zna, wc9, Unit>> list) {
            super(3);
            this.a = wnaVar;
            this.b = rdVar;
            this.c = list;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "applier");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "rememberManager");
            wna wnaVar = this.a;
            List<y84<wp<?>, zna, wc9, Unit>> list = this.c;
            zna E = wnaVar.E();
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).invoke(wpVar, E, wc9Var);
                }
                Unit unit = Unit.a;
                E.G();
                znaVar.D();
                wna wnaVar2 = this.a;
                znaVar.p0(wnaVar2, this.b.d(wnaVar2), false);
                znaVar.P();
            } catch (Throwable th) {
                E.G();
                throw th;
            }
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "<anonymous parameter 1>", "Lwc9;", "rememberManager", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$y */
    /* loaded from: classes.dex */
    static final class y extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Function0<Unit> function0) {
            super(3);
            this.a = function0;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "<anonymous parameter 1>");
            z65.h(wc9Var, "rememberManager");
            wc9Var.a(this.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp;", "<anonymous parameter 0>", "Lzna;", "slots", "Lwc9;", "<anonymous parameter 2>", "", "a", "(Lwp;Lzna;Lwc9;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: sn1$z */
    /* loaded from: classes.dex */
    public static final class z extends ej5 implements y84<wp<?>, zna, wc9, Unit> {
        final /* synthetic */ rd a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(rd rdVar) {
            super(3);
            this.a = rdVar;
        }

        public final void a(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            z65.h(wpVar, "<anonymous parameter 0>");
            z65.h(znaVar, "slots");
            z65.h(wc9Var, "<anonymous parameter 2>");
            znaVar.R(this.a);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(wp<?> wpVar, zna znaVar, wc9 wc9Var) {
            a(wpVar, znaVar, wc9Var);
            return Unit.a;
        }
    }

    public sn1(wp<?> wpVar, do1 do1Var, wna wnaVar, Set<xc9> set, List<y84<wp<?>, zna, wc9, Unit>> list, List<y84<wp<?>, zna, wc9, Unit>> list2, jv1 jv1Var) {
        z65.h(wpVar, "applier");
        z65.h(do1Var, "parentContext");
        z65.h(wnaVar, "slotTable");
        z65.h(set, "abandonSet");
        z65.h(list, "changes");
        z65.h(list2, "lateChanges");
        z65.h(jv1Var, "composition");
        this.b = wpVar;
        this.c = do1Var;
        this.d = wnaVar;
        this.e = set;
        this.f = list;
        this.g = list2;
        this.h = jv1Var;
        this.i = new qsa<>();
        this.l = new z55();
        this.n = new z55();
        this.t = new ArrayList();
        this.u = new z55();
        this.v = cz7.a();
        this.w = new r55<>(0, 1, null);
        this.y = new z55();
        this.A = -1;
        this.D = true;
        this.E = new f(this);
        this.F = new qsa<>();
        vna D = wnaVar.D();
        D.d();
        this.I = D;
        wna wnaVar2 = new wna();
        this.J = wnaVar2;
        zna E = wnaVar2.E();
        E.G();
        this.K = E;
        vna D2 = this.J.D();
        try {
            rd a2 = D2.a(0);
            D2.d();
            this.O = a2;
            this.P = new ArrayList();
            this.T = new qsa<>();
            this.W = true;
            this.X = new z55();
            this.Y = new qsa<>();
            this.Z = -1;
            this.a0 = -1;
            this.b0 = -1;
        } catch (Throwable th) {
            D2.d();
            throw th;
        }
    }

    private final void A0(List<Pair<hp6, hp6>> list) {
        y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var;
        wna g2;
        rd a2;
        List u2;
        List list2;
        wna a3;
        y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var2;
        List<y84<wp<?>, zna, wc9, Unit>> list3 = this.g;
        List list4 = this.f;
        try {
            this.f = list3;
            y84Var = tn1.e;
            W0(y84Var);
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Pair<hp6, hp6> pair = list.get(i3);
                hp6 a4 = pair.a();
                hp6 b2 = pair.b();
                rd a5 = a4.a();
                int g3 = a4.g().g(a5);
                ca9 ca9Var = new ca9();
                R0();
                W0(new i(ca9Var, a5));
                if (b2 == null) {
                    if (z65.c(a4.g(), this.J)) {
                        g0();
                    }
                    vna D = a4.g().D();
                    D.M(g3);
                    this.U = g3;
                    ArrayList arrayList = new ArrayList();
                    U0(this, null, null, null, null, new j(this, arrayList, D, a4), 15, null);
                    if (!arrayList.isEmpty()) {
                        W0(new k(ca9Var, arrayList));
                    }
                    Unit unit = Unit.a;
                    D.d();
                } else {
                    gp6 k2 = this.c.k(b2);
                    if (k2 == null || (g2 = k2.a()) == null) {
                        g2 = b2.g();
                    }
                    if (k2 == null || (a3 = k2.a()) == null || (a2 = a3.d(i2)) == null) {
                        a2 = b2.a();
                    }
                    u2 = tn1.u(g2, a2);
                    if (!u2.isEmpty()) {
                        W0(new l(ca9Var, u2));
                        if (z65.c(a4.g(), this.d)) {
                            int g4 = this.d.g(a5);
                            H1(g4, L1(g4) + u2.size());
                        }
                    }
                    W0(new m(k2, this, b2, a4));
                    vna D2 = g2.D();
                    vna vnaVar = this.I;
                    int[] iArr = this.o;
                    this.o = null;
                    this.I = D2;
                    int g5 = g2.g(a2);
                    D2.M(g5);
                    this.U = g5;
                    ArrayList arrayList2 = new ArrayList();
                    List list5 = this.f;
                    try {
                        this.f = arrayList2;
                        list2 = list5;
                    } catch (Throwable th) {
                        th = th;
                        list2 = list5;
                    }
                    try {
                        T0(b2.b(), a4.b(), Integer.valueOf(D2.j()), b2.d(), new n(this, a4));
                        Unit unit2 = Unit.a;
                        this.f = list2;
                        if (!arrayList2.isEmpty()) {
                            W0(new o(ca9Var, arrayList2));
                        }
                        this.I = vnaVar;
                        this.o = iArr;
                        D2.d();
                    } catch (Throwable th2) {
                        th = th2;
                        this.f = list2;
                        throw th;
                    }
                }
                y84Var2 = tn1.b;
                W0(y84Var2);
                i3++;
                i2 = 0;
            }
            W0(p.a);
            this.U = 0;
            Unit unit3 = Unit.a;
            this.f = list4;
        } catch (Throwable th3) {
            this.f = list4;
            throw th3;
        }
    }

    private final void A1(boolean z2, Object obj) {
        if (z2) {
            this.I.R();
            return;
        }
        if (obj != null && this.I.k() != obj) {
            l1(this, false, new e0(obj), 1, null);
        }
        this.I.Q();
    }

    private static final int B0(zna znaVar) {
        int x0;
        int V = znaVar.V();
        int W = znaVar.W();
        while (W >= 0 && !znaVar.l0(W)) {
            W = znaVar.z0(W);
        }
        int i2 = W + 1;
        int i3 = 0;
        while (i2 < V) {
            if (znaVar.g0(V, i2)) {
                if (znaVar.l0(i2)) {
                    i3 = 0;
                }
                i2++;
            } else {
                if (znaVar.l0(i2)) {
                    x0 = 1;
                } else {
                    x0 = znaVar.x0(i2);
                }
                i3 += x0;
                i2 += znaVar.d0(i2);
            }
        }
        return i3;
    }

    private final void B1() {
        int t2;
        this.I = this.d.D();
        x1(100);
        this.c.o();
        this.v = this.c.e();
        z55 z55Var = this.y;
        t2 = tn1.t(this.x);
        z55Var.i(t2);
        this.x = K(this.v);
        this.M = null;
        if (!this.q) {
            this.q = this.c.d();
        }
        Set<fo1> set = (Set) qo1.d(this.v, s45.a());
        if (set != null) {
            set.add(this.d);
            this.c.l(set);
        }
        x1(this.c.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C0(zna znaVar, rd rdVar, wp<Object> wpVar) {
        boolean z2;
        int B = znaVar.B(rdVar);
        boolean z3 = true;
        if (znaVar.V() < B) {
            z2 = true;
        } else {
            z2 = false;
        }
        tn1.T(z2);
        D0(znaVar, wpVar, B);
        int B0 = B0(znaVar);
        while (znaVar.V() < B) {
            if (znaVar.f0(B)) {
                if (znaVar.k0()) {
                    wpVar.g(znaVar.v0(znaVar.V()));
                    B0 = 0;
                }
                znaVar.U0();
            } else {
                B0 += znaVar.O0();
            }
        }
        if (znaVar.V() != B) {
            z3 = false;
        }
        tn1.T(z3);
        return B0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(zna znaVar, wp<Object> wpVar, int i2) {
        while (!znaVar.h0(i2)) {
            znaVar.P0();
            if (znaVar.l0(znaVar.W())) {
                wpVar.i();
            }
            znaVar.O();
        }
    }

    private final void D1(int i2, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i2 == 207 && !z65.c(obj2, qn1.a.a())) {
                E1(obj2.hashCode());
            } else {
                E1(i2);
            }
        } else if (obj instanceof Enum) {
            E1(((Enum) obj).ordinal());
        } else {
            E1(obj.hashCode());
        }
    }

    private final void E1(int i2) {
        this.R = i2 ^ Integer.rotateLeft(H(), 3);
    }

    private final int F0(int i2) {
        return (-2) - i2;
    }

    private final void F1(int i2, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i2 == 207 && !z65.c(obj2, qn1.a.a())) {
                G1(obj2.hashCode());
            } else {
                G1(i2);
            }
        } else if (obj instanceof Enum) {
            G1(((Enum) obj).ordinal());
        } else {
            G1(obj.hashCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        r10.w.c(r10.I.j(), r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(defpackage.fp6<java.lang.Object> r11, defpackage.bz7 r12, java.lang.Object r13, boolean r14) {
        /*
            r10 = this;
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r10.z1(r0, r11)
            r10.K(r13)
            int r1 = r10.H()
            r10.R = r0     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r10.e()     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L21
            zna r0 = r10.K     // Catch: java.lang.Throwable -> L1e
            defpackage.zna.n0(r0, r3, r4, r2)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r11 = move-exception
            goto La5
        L21:
            boolean r0 = r10.e()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L28
            goto L35
        L28:
            vna r0 = r10.I     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.k()     // Catch: java.lang.Throwable -> L1e
            boolean r0 = defpackage.z65.c(r0, r12)     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L35
            r3 = 1
        L35:
            if (r3 == 0) goto L42
            r55<bz7> r0 = r10.w     // Catch: java.lang.Throwable -> L1e
            vna r5 = r10.I     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.j()     // Catch: java.lang.Throwable -> L1e
            r0.c(r5, r12)     // Catch: java.lang.Throwable -> L1e
        L42:
            java.lang.Object r0 = defpackage.tn1.C()     // Catch: java.lang.Throwable -> L1e
            qi4$a r5 = defpackage.qi4.a     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.a()     // Catch: java.lang.Throwable -> L1e
            r6 = 202(0xca, float:2.83E-43)
            r10.w1(r6, r0, r5, r12)     // Catch: java.lang.Throwable -> L1e
            boolean r12 = r10.e()     // Catch: java.lang.Throwable -> L1e
            if (r12 == 0) goto L87
            if (r14 != 0) goto L87
            r10.L = r4     // Catch: java.lang.Throwable -> L1e
            r10.M = r2     // Catch: java.lang.Throwable -> L1e
            zna r12 = r10.K     // Catch: java.lang.Throwable -> L1e
            int r14 = r12.W()     // Catch: java.lang.Throwable -> L1e
            int r14 = r12.z0(r14)     // Catch: java.lang.Throwable -> L1e
            rd r7 = r12.A(r14)     // Catch: java.lang.Throwable -> L1e
            hp6 r12 = new hp6     // Catch: java.lang.Throwable -> L1e
            jv1 r5 = r10.v0()     // Catch: java.lang.Throwable -> L1e
            wna r6 = r10.J     // Catch: java.lang.Throwable -> L1e
            java.util.List r8 = defpackage.ic1.l()     // Catch: java.lang.Throwable -> L1e
            bz7 r9 = r10.h0()     // Catch: java.lang.Throwable -> L1e
            r2 = r12
            r3 = r11
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1e
            do1 r11 = r10.c     // Catch: java.lang.Throwable -> L1e
            r11.h(r12)     // Catch: java.lang.Throwable -> L1e
            goto L9c
        L87:
            boolean r12 = r10.x     // Catch: java.lang.Throwable -> L1e
            r10.x = r3     // Catch: java.lang.Throwable -> L1e
            sn1$q r14 = new sn1$q     // Catch: java.lang.Throwable -> L1e
            r14.<init>(r11, r13)     // Catch: java.lang.Throwable -> L1e
            r11 = 316014703(0x12d6006f, float:1.3505406E-27)
            en1 r11 = defpackage.gn1.c(r11, r4, r14)     // Catch: java.lang.Throwable -> L1e
            defpackage.f6.b(r10, r11)     // Catch: java.lang.Throwable -> L1e
            r10.x = r12     // Catch: java.lang.Throwable -> L1e
        L9c:
            r10.n0()
            r10.R = r1
            r10.o0()
            return
        La5:
            r10.n0()
            r10.R = r1
            r10.o0()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn1.G0(fp6, bz7, java.lang.Object, boolean):void");
    }

    private final void G1(int i2) {
        this.R = Integer.rotateRight(i2 ^ H(), 3);
    }

    private final void H1(int i2, int i3) {
        if (L1(i2) != i3) {
            if (i2 < 0) {
                HashMap<Integer, Integer> hashMap = this.p;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.p = hashMap;
                }
                hashMap.put(Integer.valueOf(i2), Integer.valueOf(i3));
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.I.t()];
                xr.r(iArr, -1, 0, 0, 6, null);
                this.o = iArr;
            }
            iArr[i2] = i3;
        }
    }

    private final void I1(int i2, int i3) {
        int L1 = L1(i2);
        if (L1 != i3) {
            int i4 = i3 - L1;
            int b2 = this.i.b() - 1;
            while (i2 != -1) {
                int L12 = L1(i2) + i4;
                H1(i2, L12);
                int i5 = b2;
                while (true) {
                    if (-1 < i5) {
                        qx7 f2 = this.i.f(i5);
                        if (f2 != null && f2.n(i2, L12)) {
                            b2 = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    i2 = this.I.r();
                } else if (!this.I.F(i2)) {
                    i2 = this.I.L(i2);
                } else {
                    return;
                }
            }
        }
    }

    private final Object J0(vna vnaVar, int i2) {
        return vnaVar.H(i2);
    }

    private final bz7 J1(bz7 bz7Var, bz7 bz7Var2) {
        bz7.a f2 = bz7Var.f();
        f2.putAll(bz7Var2);
        bz7 a2 = f2.a();
        y1(ChatFragment.REQUEST_PERMISSION_RECORD_AUDIO, tn1.G());
        K(a2);
        K(bz7Var2);
        n0();
        return a2;
    }

    private final int K0(int i2, int i3, int i4, int i5) {
        int L = this.I.L(i3);
        while (L != i4 && !this.I.F(L)) {
            L = this.I.L(L);
        }
        if (this.I.F(L)) {
            i5 = 0;
        }
        if (L == i3) {
            return i5;
        }
        int L1 = (L1(L) - this.I.J(i3)) + i5;
        loop1: while (i5 < L1 && L != i2) {
            L++;
            while (L < i2) {
                int A = this.I.A(L) + L;
                if (i2 >= A) {
                    i5 += L1(L);
                    L = A;
                }
            }
            break loop1;
        }
        return i5;
    }

    private final void L() {
        c0();
        this.i.a();
        this.l.a();
        this.n.a();
        this.u.a();
        this.y.a();
        this.w.a();
        if (!this.I.i()) {
            this.I.d();
        }
        if (!this.K.U()) {
            this.K.G();
        }
        this.P.clear();
        g0();
        this.R = 0;
        this.B = 0;
        this.s = false;
        this.Q = false;
        this.z = false;
        this.G = false;
        this.r = false;
        this.A = -1;
    }

    private final int L1(int i2) {
        int i3;
        Integer num;
        if (i2 < 0) {
            HashMap<Integer, Integer> hashMap = this.p;
            if (hashMap != null && (num = hashMap.get(Integer.valueOf(i2))) != null) {
                return num.intValue();
            }
            return 0;
        }
        int[] iArr = this.o;
        if (iArr != null && (i3 = iArr[i2]) >= 0) {
            return i3;
        }
        return this.I.J(i2);
    }

    private final void M0() {
        if (this.T.d()) {
            N0(this.T.i());
            this.T.a();
        }
    }

    private final void M1() {
        if (this.s) {
            this.s = false;
        } else {
            tn1.w("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void N0(Object[] objArr) {
        W0(new r(objArr));
    }

    private final void N1() {
        if (!this.s) {
            return;
        }
        tn1.w("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    private final void O0() {
        int i2 = this.c0;
        this.c0 = 0;
        if (i2 > 0) {
            int i3 = this.Z;
            if (i3 >= 0) {
                this.Z = -1;
                X0(new s(i3, i2));
                return;
            }
            int i4 = this.a0;
            this.a0 = -1;
            int i5 = this.b0;
            this.b0 = -1;
            X0(new t(i4, i5, i2));
        }
    }

    private final void P0(boolean z2) {
        int j2;
        boolean z3;
        if (z2) {
            j2 = this.I.r();
        } else {
            j2 = this.I.j();
        }
        int i2 = j2 - this.U;
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (i2 > 0) {
                W0(new u(i2));
                this.U = j2;
                return;
            }
            return;
        }
        tn1.w("Tried to seek backward".toString());
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ void Q0(sn1 sn1Var, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        sn1Var.P0(z2);
    }

    private final void R0() {
        int i2 = this.S;
        if (i2 > 0) {
            this.S = 0;
            W0(new v(i2));
        }
    }

    private final <R> R T0(jv1 jv1Var, jv1 jv1Var2, Integer num, List<Pair<e99, lt4<Object>>> list, Function0<? extends R> function0) {
        R r2;
        int i2;
        boolean z2 = this.W;
        boolean z3 = this.G;
        int i3 = this.k;
        try {
            this.W = false;
            this.G = true;
            this.k = 0;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Pair<e99, lt4<Object>> pair = list.get(i4);
                e99 a2 = pair.a();
                lt4<Object> b2 = pair.b();
                if (b2 != null) {
                    Object[] t2 = b2.t();
                    int size2 = b2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        Object obj = t2[i5];
                        z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        C1(a2, obj);
                    }
                } else {
                    C1(a2, null);
                }
            }
            if (jv1Var != null) {
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = -1;
                }
                r2 = (R) jv1Var.f(jv1Var2, i2, function0);
                if (r2 == null) {
                }
                this.W = z2;
                this.G = z3;
                this.k = i3;
                return r2;
            }
            r2 = function0.invoke();
            this.W = z2;
            this.G = z3;
            this.k = i3;
            return r2;
        } catch (Throwable th) {
            this.W = z2;
            this.G = z3;
            this.k = i3;
            throw th;
        }
    }

    static /* synthetic */ Object U0(sn1 sn1Var, jv1 jv1Var, jv1 jv1Var2, Integer num, List list, Function0 function0, int i2, Object obj) {
        jv1 jv1Var3;
        jv1 jv1Var4;
        Integer num2;
        List l2;
        if ((i2 & 1) != 0) {
            jv1Var3 = null;
        } else {
            jv1Var3 = jv1Var;
        }
        if ((i2 & 2) != 0) {
            jv1Var4 = null;
        } else {
            jv1Var4 = jv1Var2;
        }
        if ((i2 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            l2 = kc1.l();
            list2 = l2;
        }
        return sn1Var.T0(jv1Var3, jv1Var4, num2, list2, function0);
    }

    private final void V0() {
        h75 B;
        boolean z2 = this.G;
        this.G = true;
        int r2 = this.I.r();
        int A = this.I.A(r2) + r2;
        int i2 = this.k;
        int H = H();
        int i3 = this.m;
        B = tn1.B(this.t, this.I.j(), A);
        boolean z3 = false;
        int i4 = r2;
        while (B != null) {
            int b2 = B.b();
            tn1.R(this.t, b2);
            if (B.d()) {
                this.I.M(b2);
                int j2 = this.I.j();
                n1(i4, j2, r2);
                this.k = K0(b2, j2, r2, i2);
                this.R = f0(this.I.L(j2), r2, H);
                this.M = null;
                B.c().h(this);
                this.M = null;
                this.I.N(r2);
                i4 = j2;
                z3 = true;
            } else {
                this.F.h(B.c());
                B.c().x();
                this.F.g();
            }
            B = tn1.B(this.t, this.I.j(), A);
        }
        if (z3) {
            n1(i4, r2, r2);
            this.I.P();
            int L1 = L1(r2);
            this.k = i2 + L1;
            this.m = i3 + L1;
        } else {
            v1();
        }
        this.R = H;
        this.G = z2;
    }

    private final void W0(y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var) {
        this.f.add(y84Var);
    }

    private final void X0(y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var) {
        R0();
        M0();
        W0(y84Var);
    }

    private final void Y0() {
        y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var;
        r1(this.I.j());
        y84Var = tn1.a;
        j1(y84Var);
        this.U += this.I.o();
    }

    private final void Z0(Object obj) {
        this.T.h(obj);
    }

    private final void a0() {
        h75 R;
        e99 e99Var;
        boolean z2;
        if (!e()) {
            R = tn1.R(this.t, this.I.r());
            Object G = this.I.G();
            if (z65.c(G, qn1.a.a())) {
                jv1 v0 = v0();
                z65.f(v0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                e99Var = new e99((io1) v0);
                K1(e99Var);
            } else {
                z65.f(G, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                e99Var = (e99) G;
            }
            if (R != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            e99Var.C(z2);
            this.F.h(e99Var);
            e99Var.G(this.C);
            return;
        }
        jv1 v02 = v0();
        z65.f(v02, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        e99 e99Var2 = new e99((io1) v02);
        this.F.h(e99Var2);
        K1(e99Var2);
        e99Var2.G(this.C);
    }

    private final void a1() {
        boolean z2;
        y84 y84Var;
        int r2 = this.I.r();
        if (this.X.g(-1) <= r2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.X.g(-1) == r2) {
                this.X.h();
                y84Var = tn1.c;
                l1(this, false, y84Var, 1, null);
                return;
            }
            return;
        }
        tn1.w("Missed recording an endGroup".toString());
        throw new KotlinNothingValueException();
    }

    private final void b1() {
        y84 y84Var;
        if (this.V) {
            y84Var = tn1.c;
            l1(this, false, y84Var, 1, null);
            this.V = false;
        }
    }

    private final void c0() {
        this.j = null;
        this.k = 0;
        this.m = 0;
        this.U = 0;
        this.R = 0;
        this.s = false;
        this.V = false;
        this.X.a();
        this.F.a();
        d0();
    }

    private final void c1(y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var) {
        this.P.add(y84Var);
    }

    private final void d0() {
        this.o = null;
        this.p = null;
    }

    private final void d1(rd rdVar) {
        List I0;
        if (!this.P.isEmpty()) {
            I0 = sc1.I0(this.P);
            this.P.clear();
            R0();
            M0();
            j1(new x(this.J, rdVar, I0));
            return;
        }
        j1(new w(this.J, rdVar));
    }

    private final void e1(y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var) {
        this.Y.h(y84Var);
    }

    private final int f0(int i2, int i3, int i4) {
        if (i2 != i3) {
            int z0 = z0(this.I, i2);
            if (z0 == 126665345) {
                return z0;
            }
            return Integer.rotateLeft(f0(this.I.L(i2), i3, i4), 3) ^ z0;
        }
        return i4;
    }

    private final void f1(int i2, int i3, int i4) {
        if (i4 > 0) {
            int i5 = this.c0;
            if (i5 > 0 && this.a0 == i2 - i5 && this.b0 == i3 - i5) {
                this.c0 = i5 + i4;
                return;
            }
            O0();
            this.a0 = i2;
            this.b0 = i3;
            this.c0 = i4;
        }
    }

    private final void g0() {
        tn1.T(this.K.U());
        wna wnaVar = new wna();
        this.J = wnaVar;
        zna E = wnaVar.E();
        E.G();
        this.K = E;
    }

    private final void g1(int i2) {
        this.U = i2 - (this.I.j() - this.U);
    }

    private final bz7 h0() {
        bz7 bz7Var = this.M;
        if (bz7Var != null) {
            return bz7Var;
        }
        return i0(this.I.r());
    }

    private final void h1(int i2, int i3) {
        boolean z2;
        if (i3 > 0) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.Z == i2) {
                    this.c0 += i3;
                    return;
                }
                O0();
                this.Z = i2;
                this.c0 = i3;
                return;
            }
            tn1.w(("Invalid remove index " + i2).toString());
            throw new KotlinNothingValueException();
        }
    }

    private final bz7 i0(int i2) {
        if (e() && this.L) {
            int W = this.K.W();
            while (W > 0) {
                if (this.K.b0(W) == 202 && z65.c(this.K.c0(W), tn1.C())) {
                    Object Z = this.K.Z(W);
                    z65.f(Z, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    bz7 bz7Var = (bz7) Z;
                    this.M = bz7Var;
                    return bz7Var;
                }
                W = this.K.z0(W);
            }
        }
        if (this.I.t() > 0) {
            while (i2 > 0) {
                if (this.I.y(i2) == 202 && z65.c(this.I.z(i2), tn1.C())) {
                    bz7 b2 = this.w.b(i2);
                    if (b2 == null) {
                        Object v2 = this.I.v(i2);
                        z65.f(v2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        b2 = (bz7) v2;
                    }
                    this.M = b2;
                    return b2;
                }
                i2 = this.I.L(i2);
            }
        }
        bz7 bz7Var2 = this.v;
        this.M = bz7Var2;
        return bz7Var2;
    }

    private final void i1() {
        vna vnaVar;
        int r2;
        y84 y84Var;
        if (this.I.t() > 0 && this.X.g(-2) != (r2 = (vnaVar = this.I).r())) {
            if (!this.V && this.W) {
                y84Var = tn1.d;
                l1(this, false, y84Var, 1, null);
                this.V = true;
            }
            if (r2 > 0) {
                rd a2 = vnaVar.a(r2);
                this.X.i(r2);
                l1(this, false, new z(a2), 1, null);
            }
        }
    }

    private final void j1(y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var) {
        Q0(this, false, 1, null);
        i1();
        W0(y84Var);
    }

    private final void k0(kt4<e99, lt4<Object>> kt4Var, Function2<? super qn1, ? super Integer, Unit> function2) {
        if (!this.G) {
            Object a2 = rjb.a.a("Compose:recompose");
            try {
                this.C = fpa.F().f();
                this.w.a();
                int h2 = kt4Var.h();
                for (int i2 = 0; i2 < h2; i2++) {
                    Object obj = kt4Var.g()[i2];
                    z65.f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    lt4 lt4Var = (lt4) kt4Var.i()[i2];
                    e99 e99Var = (e99) obj;
                    rd j2 = e99Var.j();
                    if (j2 != null) {
                        this.t.add(new h75(e99Var, j2.a(), lt4Var));
                    } else {
                        return;
                    }
                }
                List<h75> list = this.t;
                if (list.size() > 1) {
                    oc1.B(list, new g());
                }
                this.k = 0;
                this.G = true;
                B1();
                Object I0 = I0();
                if (I0 != function2 && function2 != null) {
                    K1(function2);
                }
                f fVar = this.E;
                gr6<u03> a3 = qpa.a();
                try {
                    a3.b(fVar);
                    if (function2 != null) {
                        y1(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, tn1.D());
                        f6.b(this, function2);
                        n0();
                    } else if ((this.r || this.x) && I0 != null && !z65.c(I0, qn1.a.a())) {
                        y1(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY, tn1.D());
                        f6.b(this, (Function2) unb.e(I0, 2));
                        n0();
                    } else {
                        t1();
                    }
                    a3.z(a3.s() - 1);
                    p0();
                    this.G = false;
                    this.t.clear();
                    Unit unit = Unit.a;
                    return;
                } catch (Throwable th) {
                    a3.z(a3.s() - 1);
                    throw th;
                }
            } finally {
                rjb.a.b(a2);
            }
        }
        tn1.w("Reentrant composition is not supported".toString());
        throw new KotlinNothingValueException();
    }

    private final void k1(boolean z2, y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var) {
        P0(z2);
        W0(y84Var);
    }

    private final void l0(int i2, int i3) {
        if (i2 > 0 && i2 != i3) {
            l0(this.I.L(i2), i3);
            if (this.I.F(i2)) {
                Z0(J0(this.I, i2));
            }
        }
    }

    static /* synthetic */ void l1(sn1 sn1Var, boolean z2, y84 y84Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        sn1Var.k1(z2, y84Var);
    }

    private final void m0(boolean z2) {
        List<gf5> list;
        if (e()) {
            int W = this.K.W();
            F1(this.K.b0(W), this.K.c0(W), this.K.Z(W));
        } else {
            int r2 = this.I.r();
            F1(this.I.y(r2), this.I.z(r2), this.I.v(r2));
        }
        int i2 = this.m;
        qx7 qx7Var = this.j;
        int i3 = 0;
        if (qx7Var != null && qx7Var.b().size() > 0) {
            List<gf5> b2 = qx7Var.b();
            List<gf5> f2 = qx7Var.f();
            Set e2 = hr5.e(f2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f2.size();
            int size2 = b2.size();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < size2) {
                gf5 gf5Var = b2.get(i4);
                if (!e2.contains(gf5Var)) {
                    h1(qx7Var.g(gf5Var) + qx7Var.e(), gf5Var.c());
                    qx7Var.n(gf5Var.b(), i3);
                    g1(gf5Var.b());
                    this.I.M(gf5Var.b());
                    Y0();
                    this.I.O();
                    tn1.S(this.t, gf5Var.b(), gf5Var.b() + this.I.A(gf5Var.b()));
                } else if (!linkedHashSet.contains(gf5Var)) {
                    if (i5 < size) {
                        gf5 gf5Var2 = f2.get(i5);
                        if (gf5Var2 != gf5Var) {
                            int g2 = qx7Var.g(gf5Var2);
                            linkedHashSet.add(gf5Var2);
                            if (g2 != i6) {
                                int o2 = qx7Var.o(gf5Var2);
                                list = f2;
                                f1(qx7Var.e() + g2, i6 + qx7Var.e(), o2);
                                qx7Var.j(g2, i6, o2);
                            } else {
                                list = f2;
                            }
                        } else {
                            list = f2;
                            i4++;
                        }
                        i5++;
                        i6 += qx7Var.o(gf5Var2);
                        f2 = list;
                    }
                    i3 = 0;
                }
                i4++;
                i3 = 0;
            }
            O0();
            if (b2.size() > 0) {
                g1(this.I.l());
                this.I.P();
            }
        }
        int i7 = this.k;
        while (!this.I.D()) {
            int j2 = this.I.j();
            Y0();
            h1(i7, this.I.O());
            tn1.S(this.t, j2, this.I.j());
        }
        boolean e3 = e();
        if (e3) {
            if (z2) {
                o1();
                i2 = 1;
            }
            this.I.f();
            int W2 = this.K.W();
            this.K.O();
            if (!this.I.q()) {
                int F0 = F0(W2);
                this.K.P();
                this.K.G();
                d1(this.O);
                this.Q = false;
                if (!this.d.isEmpty()) {
                    H1(F0, 0);
                    I1(F0, i2);
                }
            }
        } else {
            if (z2) {
                m1();
            }
            a1();
            int r3 = this.I.r();
            if (i2 != L1(r3)) {
                I1(r3, i2);
            }
            if (z2) {
                i2 = 1;
            }
            this.I.g();
            O0();
        }
        s0(i2, e3);
    }

    private final void m1() {
        if (this.T.d()) {
            this.T.g();
        } else {
            this.S++;
        }
    }

    private final void n0() {
        m0(false);
    }

    private final void n1(int i2, int i3, int i4) {
        int M;
        vna vnaVar = this.I;
        M = tn1.M(vnaVar, i2, i3, i4);
        while (i2 > 0 && i2 != M) {
            if (vnaVar.F(i2)) {
                m1();
            }
            i2 = vnaVar.L(i2);
        }
        l0(i3, M);
    }

    private final void o1() {
        this.P.add(this.Y.g());
    }

    private final void p0() {
        n0();
        this.c.c();
        n0();
        b1();
        t0();
        this.I.d();
        this.r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p1(hp6 hp6Var, zna znaVar) {
        wna wnaVar = new wna();
        zna E = wnaVar.E();
        try {
            E.D();
            E.V0(126665345, hp6Var.c());
            zna.n0(E, 0, 1, null);
            E.Y0(hp6Var.f());
            List<rd> u0 = znaVar.u0(hp6Var.a(), 1, E);
            E.O0();
            E.O();
            E.P();
            E.G();
            gp6 gp6Var = new gp6(wnaVar);
            e99.a aVar = e99.h;
            if (aVar.b(wnaVar, u0)) {
                try {
                    aVar.a(wnaVar.E(), u0, new a0(v0(), hp6Var));
                    Unit unit = Unit.a;
                } finally {
                }
            }
            this.c.j(hp6Var, gp6Var);
        } finally {
        }
    }

    private final void q0() {
        if (this.K.U()) {
            zna E = this.J.E();
            this.K = E;
            E.P0();
            this.L = false;
            this.M = null;
        }
    }

    private final void q1() {
        y84<? super wp<?>, ? super zna, ? super wc9, Unit> y84Var;
        if (this.d.p()) {
            ArrayList arrayList = new ArrayList();
            this.N = arrayList;
            vna D = this.d.D();
            try {
                this.I = D;
                List list = this.f;
                this.f = arrayList;
                r1(0);
                R0();
                if (this.V) {
                    y84Var = tn1.b;
                    W0(y84Var);
                    b1();
                }
                Unit unit = Unit.a;
                this.f = list;
            } finally {
                D.d();
            }
        }
    }

    private final void r0(boolean z2, qx7 qx7Var) {
        this.i.h(this.j);
        this.j = qx7Var;
        this.l.i(this.k);
        if (z2) {
            this.k = 0;
        }
        this.n.i(this.m);
        this.m = 0;
    }

    private final void r1(int i2) {
        s1(this, i2, false, 0);
        O0();
    }

    private final void s0(int i2, boolean z2) {
        qx7 g2 = this.i.g();
        if (g2 != null && !z2) {
            g2.l(g2.a() + 1);
        }
        this.j = g2;
        this.k = this.l.h() + i2;
        this.m = this.n.h() + i2;
    }

    private static final int s1(sn1 sn1Var, int i2, boolean z2, int i3) {
        boolean z3;
        int i4;
        a aVar;
        List y2;
        int i5 = 1;
        if (sn1Var.I.B(i2)) {
            int y3 = sn1Var.I.y(i2);
            Object z4 = sn1Var.I.z(i2);
            if (y3 == 126665345 && (z4 instanceof fp6)) {
                fp6 fp6Var = (fp6) z4;
                Object x2 = sn1Var.I.x(i2, 0);
                rd a2 = sn1Var.I.a(i2);
                y2 = tn1.y(sn1Var.t, i2, sn1Var.I.A(i2) + i2);
                ArrayList arrayList = new ArrayList(y2.size());
                int size = y2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    h75 h75Var = (h75) y2.get(i6);
                    arrayList.add(lnb.a(h75Var.c(), h75Var.a()));
                }
                hp6 hp6Var = new hp6(fp6Var, x2, sn1Var.v0(), sn1Var.d, a2, arrayList, sn1Var.i0(i2));
                sn1Var.c.b(hp6Var);
                sn1Var.i1();
                sn1Var.W0(new b0(hp6Var));
                if (z2) {
                    sn1Var.O0();
                    sn1Var.R0();
                    sn1Var.M0();
                    if (!sn1Var.I.F(i2)) {
                        i5 = sn1Var.I.J(i2);
                    }
                    if (i5 <= 0) {
                        return 0;
                    }
                    sn1Var.h1(i3, i5);
                    return 0;
                }
                return sn1Var.I.J(i2);
            } else if (y3 == 206 && z65.c(z4, tn1.I())) {
                Object x3 = sn1Var.I.x(i2, 0);
                if (x3 instanceof a) {
                    aVar = (a) x3;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    for (sn1 sn1Var2 : aVar.d().s()) {
                        sn1Var2.q1();
                        sn1Var.c.n(sn1Var2.v0());
                    }
                }
                return sn1Var.I.J(i2);
            } else {
                return sn1Var.I.J(i2);
            }
        } else if (sn1Var.I.e(i2)) {
            int A = sn1Var.I.A(i2) + i2;
            int i7 = i2 + 1;
            int i8 = 0;
            while (i7 < A) {
                boolean F = sn1Var.I.F(i7);
                if (F) {
                    sn1Var.O0();
                    sn1Var.Z0(sn1Var.I.H(i7));
                }
                if (!F && !z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (F) {
                    i4 = 0;
                } else {
                    i4 = i3 + i8;
                }
                i8 += s1(sn1Var, i7, z3, i4);
                if (F) {
                    sn1Var.O0();
                    sn1Var.m1();
                }
                i7 += sn1Var.I.A(i7);
            }
            return i8;
        } else {
            return sn1Var.I.J(i2);
        }
    }

    private final void t0() {
        R0();
        if (this.i.c()) {
            if (this.X.d()) {
                c0();
                return;
            } else {
                tn1.w("Missed recording an endGroup()".toString());
                throw new KotlinNothingValueException();
            }
        }
        tn1.w("Start/end imbalance".toString());
        throw new KotlinNothingValueException();
    }

    private final void u1() {
        this.m += this.I.O();
    }

    private final void v1() {
        this.m = this.I.s();
        this.I.P();
    }

    private final void w1(int i2, Object obj, int i3, Object obj2) {
        boolean z2;
        boolean z3;
        Object obj3 = obj;
        N1();
        D1(i2, obj, obj2);
        qi4.a aVar = qi4.a;
        int i4 = 0;
        if (i3 != aVar.a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        qx7 qx7Var = null;
        if (e()) {
            this.I.c();
            int V = this.K.V();
            if (z2) {
                this.K.X0(i2, qn1.a.a());
            } else if (obj2 != null) {
                zna znaVar = this.K;
                if (obj3 == null) {
                    obj3 = qn1.a.a();
                }
                znaVar.T0(i2, obj3, obj2);
            } else {
                zna znaVar2 = this.K;
                if (obj3 == null) {
                    obj3 = qn1.a.a();
                }
                znaVar2.V0(i2, obj3);
            }
            qx7 qx7Var2 = this.j;
            if (qx7Var2 != null) {
                gf5 gf5Var = new gf5(i2, -1, F0(V), -1, 0);
                qx7Var2.i(gf5Var, this.k - qx7Var2.e());
                qx7Var2.h(gf5Var);
            }
            r0(z2, null);
            return;
        }
        if (i3 == aVar.b() && this.z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.j == null) {
            int m2 = this.I.m();
            if (!z3 && m2 == i2 && z65.c(obj, this.I.n())) {
                A1(z2, obj2);
            } else {
                this.j = new qx7(this.I.h(), this.k);
            }
        }
        qx7 qx7Var3 = this.j;
        if (qx7Var3 != null) {
            gf5 d2 = qx7Var3.d(i2, obj);
            if (!z3 && d2 != null) {
                qx7Var3.h(d2);
                int b2 = d2.b();
                this.k = qx7Var3.g(d2) + qx7Var3.e();
                int m3 = qx7Var3.m(d2);
                int a2 = m3 - qx7Var3.a();
                qx7Var3.k(m3, qx7Var3.a());
                g1(b2);
                this.I.M(b2);
                if (a2 > 0) {
                    j1(new c0(a2));
                }
                A1(z2, obj2);
            } else {
                this.I.c();
                this.Q = true;
                this.M = null;
                q0();
                this.K.D();
                int V2 = this.K.V();
                if (z2) {
                    this.K.X0(i2, qn1.a.a());
                } else if (obj2 != null) {
                    zna znaVar3 = this.K;
                    if (obj3 == null) {
                        obj3 = qn1.a.a();
                    }
                    znaVar3.T0(i2, obj3, obj2);
                } else {
                    zna znaVar4 = this.K;
                    if (obj3 == null) {
                        obj3 = qn1.a.a();
                    }
                    znaVar4.V0(i2, obj3);
                }
                this.O = this.K.A(V2);
                gf5 gf5Var2 = new gf5(i2, -1, F0(V2), -1, 0);
                qx7Var3.i(gf5Var2, this.k - qx7Var3.e());
                qx7Var3.h(gf5Var2);
                ArrayList arrayList = new ArrayList();
                if (!z2) {
                    i4 = this.k;
                }
                qx7Var = new qx7(arrayList, i4);
            }
        }
        r0(z2, qx7Var);
    }

    private final void x1(int i2) {
        w1(i2, null, qi4.a.a(), null);
    }

    private final Object y0(vna vnaVar) {
        return vnaVar.H(vnaVar.r());
    }

    private final void y1(int i2, Object obj) {
        w1(i2, obj, qi4.a.a(), null);
    }

    private final int z0(vna vnaVar, int i2) {
        Object v2;
        if (vnaVar.C(i2)) {
            Object z2 = vnaVar.z(i2);
            if (z2 != null) {
                if (z2 instanceof Enum) {
                    return ((Enum) z2).ordinal();
                }
                if (z2 instanceof fp6) {
                    return 126665345;
                }
                return z2.hashCode();
            }
            return 0;
        }
        int y2 = vnaVar.y(i2);
        if (y2 == 207 && (v2 = vnaVar.v(i2)) != null && !z65.c(v2, qn1.a.a())) {
            y2 = v2.hashCode();
        }
        return y2;
    }

    @Override // defpackage.qn1
    public void A() {
        w1(-127, null, qi4.a.a(), null);
    }

    @Override // defpackage.qn1
    public void B() {
        w1(125, null, qi4.a.c(), null);
        this.s = true;
    }

    @Override // defpackage.qn1
    public void C(d99 d99Var) {
        e99 e99Var;
        z65.h(d99Var, Action.SCOPE_ATTRIBUTE);
        if (d99Var instanceof e99) {
            e99Var = (e99) d99Var;
        } else {
            e99Var = null;
        }
        if (e99Var != null) {
            e99Var.F(true);
        }
    }

    public final boolean C1(e99 e99Var, Object obj) {
        z65.h(e99Var, Action.SCOPE_ATTRIBUTE);
        rd j2 = e99Var.j();
        if (j2 == null) {
            return false;
        }
        int d2 = j2.d(this.I.u());
        if (this.G && d2 >= this.I.j()) {
            tn1.J(this.t, d2, e99Var, obj);
            return true;
        }
        return false;
    }

    @Override // defpackage.qn1
    public <T> void D(Function0<? extends T> function0) {
        z65.h(function0, "factory");
        M1();
        if (e()) {
            int e2 = this.l.e();
            zna znaVar = this.K;
            rd A = znaVar.A(znaVar.W());
            this.m++;
            c1(new d(function0, A, e2));
            e1(new e(A, e2));
            return;
        }
        tn1.w("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.qn1
    public void E() {
        boolean z2;
        if (this.m == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            e99 w0 = w0();
            if (w0 != null) {
                w0.y();
            }
            if (this.t.isEmpty()) {
                v1();
                return;
            } else {
                V0();
                return;
            }
        }
        tn1.w("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    public void E0(List<Pair<hp6, hp6>> list) {
        z65.h(list, "references");
        try {
            A0(list);
            c0();
        } catch (Throwable th) {
            L();
            throw th;
        }
    }

    @Override // defpackage.qn1
    public void F() {
        boolean s2;
        n0();
        n0();
        s2 = tn1.s(this.y.h());
        this.x = s2;
        this.M = null;
    }

    @Override // defpackage.qn1
    public boolean G() {
        if (this.x) {
            return true;
        }
        e99 w0 = w0();
        if (w0 != null && w0.m()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qn1
    public int H() {
        return this.R;
    }

    public final boolean H0() {
        return this.G;
    }

    @Override // defpackage.qn1
    public do1 I() {
        y1(206, tn1.I());
        a aVar = null;
        if (e()) {
            zna.n0(this.K, 0, 1, null);
        }
        Object I0 = I0();
        if (I0 instanceof a) {
            aVar = (a) I0;
        }
        if (aVar == null) {
            aVar = new a(new b(H(), this.q));
            K1(aVar);
        }
        aVar.d().v(h0());
        n0();
        return aVar.d();
    }

    public final Object I0() {
        if (e()) {
            N1();
            return qn1.a.a();
        }
        Object G = this.I.G();
        if (this.z) {
            return qn1.a.a();
        }
        return G;
    }

    @Override // defpackage.qn1
    public void J() {
        n0();
    }

    @Override // defpackage.qn1
    public boolean K(Object obj) {
        if (!z65.c(I0(), obj)) {
            K1(obj);
            return true;
        }
        return false;
    }

    public final void K1(Object obj) {
        if (e()) {
            this.K.Y0(obj);
            if (obj instanceof xc9) {
                W0(new f0(obj));
                this.e.add(obj);
                return;
            }
            return;
        }
        int p2 = this.I.p() - 1;
        if (obj instanceof xc9) {
            this.e.add(obj);
        }
        k1(true, new g0(obj, p2));
    }

    public final void L0(Function0<Unit> function0) {
        z65.h(function0, "block");
        if (!this.G) {
            this.G = true;
            try {
                function0.invoke();
                return;
            } finally {
                this.G = false;
            }
        }
        tn1.w("Preparing a composition while composing is not supported".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean S0(kt4<e99, lt4<Object>> kt4Var) {
        z65.h(kt4Var, "invalidationsRequested");
        if (this.f.isEmpty()) {
            if (!kt4Var.j() && !(!this.t.isEmpty()) && !this.r) {
                return false;
            }
            k0(kt4Var, null);
            return !this.f.isEmpty();
        }
        tn1.w("Expected applyChanges() to have been called".toString());
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.qn1
    public boolean a(boolean z2) {
        Object I0 = I0();
        if ((I0 instanceof Boolean) && z2 == ((Boolean) I0).booleanValue()) {
            return false;
        }
        K1(Boolean.valueOf(z2));
        return true;
    }

    @Override // defpackage.qn1
    public boolean b(float f2) {
        Object I0 = I0();
        if ((I0 instanceof Float) && f2 == ((Number) I0).floatValue()) {
            return false;
        }
        K1(Float.valueOf(f2));
        return true;
    }

    public final void b0() {
        g0();
        this.w.a();
    }

    @Override // defpackage.qn1
    public boolean c(int i2) {
        Object I0 = I0();
        if ((I0 instanceof Integer) && i2 == ((Number) I0).intValue()) {
            return false;
        }
        K1(Integer.valueOf(i2));
        return true;
    }

    @Override // defpackage.qn1
    public boolean d(long j2) {
        Object I0 = I0();
        if ((I0 instanceof Long) && j2 == ((Number) I0).longValue()) {
            return false;
        }
        K1(Long.valueOf(j2));
        return true;
    }

    @Override // defpackage.qn1
    public boolean e() {
        return this.Q;
    }

    public final void e0(kt4<e99, lt4<Object>> kt4Var, Function2<? super qn1, ? super Integer, Unit> function2) {
        z65.h(kt4Var, "invalidationsRequested");
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        if (this.f.isEmpty()) {
            k0(kt4Var, function2);
        } else {
            tn1.w("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.qn1
    public qn1 f(int i2) {
        w1(i2, null, qi4.a.a(), null);
        a0();
        return this;
    }

    @Override // defpackage.qn1
    public boolean g() {
        e99 w0;
        if (!e() && !this.z && !this.x && (w0 = w0()) != null && !w0.n() && !this.r) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qn1
    public wp<?> h() {
        return this.b;
    }

    @Override // defpackage.qn1
    public xw9 i() {
        e99 e99Var;
        rd a2;
        Function1<co1, Unit> i2;
        e99 e99Var2 = null;
        if (this.F.d()) {
            e99Var = this.F.g();
        } else {
            e99Var = null;
        }
        if (e99Var != null) {
            e99Var.C(false);
        }
        if (e99Var != null && (i2 = e99Var.i(this.C)) != null) {
            W0(new h(i2, this));
        }
        if (e99Var != null && !e99Var.p() && (e99Var.q() || this.q)) {
            if (e99Var.j() == null) {
                if (e()) {
                    zna znaVar = this.K;
                    a2 = znaVar.A(znaVar.W());
                } else {
                    vna vnaVar = this.I;
                    a2 = vnaVar.a(vnaVar.r());
                }
                e99Var.z(a2);
            }
            e99Var.B(false);
            e99Var2 = e99Var;
        }
        m0(false);
        return e99Var2;
    }

    @Override // defpackage.qn1
    public void j() {
        w1(125, null, qi4.a.b(), null);
        this.s = true;
    }

    public final void j0() {
        rjb rjbVar = rjb.a;
        Object a2 = rjbVar.a("Compose:Composer.dispose");
        try {
            this.c.p(this);
            this.F.a();
            this.t.clear();
            this.f.clear();
            this.w.a();
            h().clear();
            this.H = true;
            Unit unit = Unit.a;
            rjbVar.b(a2);
        } catch (Throwable th) {
            rjb.a.b(a2);
            throw th;
        }
    }

    @Override // defpackage.qn1
    public <T> T k(lo1<T> lo1Var) {
        z65.h(lo1Var, Action.KEY_ATTRIBUTE);
        return (T) qo1.d(h0(), lo1Var);
    }

    @Override // defpackage.qn1
    public <V, T> void l(V v2, Function2<? super T, ? super V, Unit> function2) {
        z65.h(function2, "block");
        c cVar = new c(function2, v2);
        if (e()) {
            c1(cVar);
        } else {
            X0(cVar);
        }
    }

    @Override // defpackage.qn1
    public CoroutineContext m() {
        return this.c.g();
    }

    @Override // defpackage.qn1
    public po1 n() {
        return h0();
    }

    @Override // defpackage.qn1
    public void o() {
        M1();
        if (!e()) {
            Object y0 = y0(this.I);
            Z0(y0);
            if (this.z && (y0 instanceof kn1)) {
                X0(h0.a);
                return;
            }
            return;
        }
        tn1.w("useNode() called while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public void o0() {
        n0();
    }

    @Override // defpackage.qn1
    public void p(Object obj) {
        K1(obj);
    }

    @Override // defpackage.qn1
    public void q(zr8<?>[] zr8VarArr) {
        bz7 J1;
        int t2;
        z65.h(zr8VarArr, "values");
        bz7 h02 = h0();
        y1(ChatFragment.REQUEST_PERMISSION_CAMERA, tn1.F());
        y1(203, tn1.H());
        bz7 bz7Var = (bz7) f6.c(this, new d0(zr8VarArr, h02));
        n0();
        boolean z2 = false;
        if (e()) {
            J1 = J1(h02, bz7Var);
            this.L = true;
        } else {
            Object w2 = this.I.w(0);
            z65.f(w2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            bz7 bz7Var2 = (bz7) w2;
            Object w3 = this.I.w(1);
            z65.f(w3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            bz7 bz7Var3 = (bz7) w3;
            if (g() && z65.c(bz7Var3, bz7Var)) {
                u1();
                J1 = bz7Var2;
            } else {
                J1 = J1(h02, bz7Var);
                z2 = !z65.c(J1, bz7Var2);
            }
        }
        if (z2 && !e()) {
            this.w.c(this.I.j(), J1);
        }
        z55 z55Var = this.y;
        t2 = tn1.t(this.x);
        z55Var.i(t2);
        this.x = z2;
        this.M = J1;
        w1(ChatFragment.REQUEST_PERMISSION_READ_EXTERNAL, tn1.C(), qi4.a.a(), J1);
    }

    @Override // defpackage.qn1
    public void r() {
        m0(true);
    }

    @Override // defpackage.qn1
    public void s() {
        n0();
        e99 w0 = w0();
        if (w0 != null && w0.q()) {
            w0.A(true);
        }
    }

    @Override // defpackage.qn1
    public void t(Function0<Unit> function0) {
        z65.h(function0, "effect");
        W0(new y(function0));
    }

    public void t1() {
        if (this.t.isEmpty()) {
            u1();
            return;
        }
        vna vnaVar = this.I;
        int m2 = vnaVar.m();
        Object n2 = vnaVar.n();
        Object k2 = vnaVar.k();
        D1(m2, n2, k2);
        A1(vnaVar.E(), null);
        V0();
        vnaVar.g();
        F1(m2, n2, k2);
    }

    @Override // defpackage.qn1
    public void u() {
        this.q = true;
    }

    public final boolean u0() {
        if (this.B > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.qn1
    public d99 v() {
        return w0();
    }

    public jv1 v0() {
        return this.h;
    }

    @Override // defpackage.qn1
    public void w(int i2) {
        w1(i2, null, qi4.a.a(), null);
    }

    public final e99 w0() {
        qsa<e99> qsaVar = this.F;
        if (this.B == 0 && qsaVar.d()) {
            return qsaVar.e();
        }
        return null;
    }

    @Override // defpackage.qn1
    public Object x() {
        return I0();
    }

    public final List<y84<wp<?>, zna, wc9, Unit>> x0() {
        return this.N;
    }

    @Override // defpackage.qn1
    public fo1 y() {
        return this.d;
    }

    @Override // defpackage.qn1
    public boolean z(Object obj) {
        if (I0() != obj) {
            K1(obj);
            return true;
        }
        return false;
    }

    public void z1(int i2, Object obj) {
        w1(i2, obj, qi4.a.a(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u001b\u0010\u000b\u001a\u00060\u0006R\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lsn1$a;", "Lxc9;", "", "a", "b", com.huawei.hms.opendevice.c.a, "Lsn1$b;", "Lsn1;", "Lsn1$b;", DateTokenConverter.CONVERTER_KEY, "()Lsn1$b;", ActionConst.REF_ATTRIBUTE, "<init>", "(Lsn1$b;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: sn1$a */
    /* loaded from: classes.dex */
    public static final class a implements xc9 {
        private final b a;

        public a(b bVar) {
            z65.h(bVar, ActionConst.REF_ATTRIBUTE);
            this.a = bVar;
        }

        @Override // defpackage.xc9
        public void b() {
            this.a.r();
        }

        @Override // defpackage.xc9
        public void c() {
            this.a.r();
        }

        public final b d() {
            return this.a;
        }

        @Override // defpackage.xc9
        public void a() {
        }
    }
}
