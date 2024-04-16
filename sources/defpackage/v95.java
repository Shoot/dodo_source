package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.l95;
import defpackage.lw5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
/* compiled from: JobSupport.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005k¡\u0001³\u0001B\u0012\u0012\u0007\u0010°\u0001\u001a\u00020\u0015¢\u0006\u0006\b±\u0001\u0010²\u0001J#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0010*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b#\u0010$J1\u0010*\u001a\u00020)2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&2\u0006\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0015H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b=\u0010:J\u0019\u0010>\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bB\u0010CJ#\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\bG\u0010HJ*\u0010J\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010I\u001a\u00020F2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0082\u0010¢\u0006\u0004\bJ\u0010KJ)\u0010M\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010L\u001a\u00020F2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u0004\u0018\u00010F*\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u00020R2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\bU\u00108J\u0019\u0010W\u001a\u00020\u00102\b\u0010V\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020\u0015¢\u0006\u0004\bY\u00106J\u000f\u0010Z\u001a\u00020\u0010H\u0014¢\u0006\u0004\bZ\u0010[J\u0011\u0010^\u001a\u00060\\j\u0002`]¢\u0006\u0004\b^\u0010_J#\u0010a\u001a\u00060\\j\u0002`]*\u00020\u000b2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010RH\u0004¢\u0006\u0004\ba\u0010bJ'\u0010d\u001a\u00020c2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bd\u0010eJ7\u0010g\u001a\u00020c2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010f\u001a\u00020\u00152\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bg\u0010hJ\u0013\u0010i\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\bi\u00108J\u0017\u0010j\u001a\u00020\u00102\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\bj\u00104J\u001f\u0010k\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020RH\u0014¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010r\u001a\u00020\u00102\u0006\u0010q\u001a\u00020\u0003¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bt\u0010 J\u0017\u0010u\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bu\u0010 J\u0019\u0010v\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bv\u0010wJ\u0013\u0010x\u001a\u00060\\j\u0002`]H\u0016¢\u0006\u0004\bx\u0010_J\u0019\u0010y\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\by\u0010wJ\u001b\u0010z\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bz\u0010:J\u0015\u0010|\u001a\u00020{2\u0006\u0010I\u001a\u00020\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010\u007f\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u007f\u0010pJ\u001b\u0010\u0080\u0001\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0005\b\u0080\u0001\u0010pJ\u0019\u0010\u0081\u0001\u001a\u00020\u00152\u0006\u0010~\u001a\u00020\u000bH\u0014¢\u0006\u0005\b\u0081\u0001\u0010 J\u001c\u0010\u0082\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0084\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J\u0011\u0010\u0085\u0001\u001a\u00020RH\u0016¢\u0006\u0005\b\u0085\u0001\u0010nJ\u0011\u0010\u0086\u0001\u001a\u00020RH\u0007¢\u0006\u0005\b\u0086\u0001\u0010nJ\u0011\u0010\u0087\u0001\u001a\u00020RH\u0010¢\u0006\u0005\b\u0087\u0001\u0010nJ\u0014\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0017\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u008a\u0001\u00108JY\u0010\u0091\u0001\u001a\u00020\u0010\"\u0005\b\u0000\u0010\u008b\u0001\"\u0004\b\u0001\u0010o2\u000e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008c\u00012%\u0010\u0090\u0001\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008f\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001JY\u0010\u0093\u0001\u001a\u00020\u0010\"\u0005\b\u0000\u0010\u008b\u0001\"\u0004\b\u0001\u0010o2\u000e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u008c\u00012%\u0010\u0090\u0001\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008f\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0092\u0001R\u001e\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010<R\u0019\u0010\u0099\u0001\u001a\u0007\u0012\u0002\b\u00030\u0096\u00018F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R.\u0010\u009f\u0001\u001a\u0004\u0018\u00010{2\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010{8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010\u0089\u0001R\u0016\u0010¢\u0001\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u00106R\u0013\u0010¤\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b£\u0001\u00106R\u0013\u0010¥\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b¥\u0001\u00106R\u0016\u0010§\u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u00106R\u001b\u0010«\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010¨\u00018F¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010\u00ad\u0001\u001a\u00020\u00158TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u00106R\u0016\u0010¯\u0001\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b®\u0001\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006´\u0001"}, d2 = {"Lv95;", "Ll95;", "La71;", "Lyq7;", "", "Lv95$c;", "state", "proposedUpdate", "d0", "(Lv95$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "k0", "(Lv95$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "", "C", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lc05;", "update", "", "X0", "(Lc05;Ljava/lang/Object;)Z", "Z", "(Lc05;Ljava/lang/Object;)V", "Lsz6;", StatisticManager.LIST, "cause", "H0", "(Lsz6;Ljava/lang/Throwable;)V", "V", "(Ljava/lang/Throwable;)Z", "I0", "", "S0", "(Ljava/lang/Object;)I", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "Lu95;", "E0", "(Lkotlin/jvm/functions/Function1;Z)Lu95;", "expect", "node", "B", "(Ljava/lang/Object;Lsz6;Lu95;)Z", "Leg3;", "M0", "(Leg3;)V", "N0", "(Lu95;)V", "z0", "()Z", "A0", "(Lcv1;)Ljava/lang/Object;", "U", "(Ljava/lang/Object;)Ljava/lang/Object;", "c0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "B0", "r0", "(Lc05;)Lsz6;", "Y0", "(Lc05;Ljava/lang/Throwable;)Z", "Z0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "a1", "(Lc05;Ljava/lang/Object;)Ljava/lang/Object;", "Lz61;", "g0", "(Lc05;)Lz61;", "child", "b1", "(Lv95$c;Lz61;Ljava/lang/Object;)Z", "lastChild", "a0", "(Lv95$c;Lz61;Ljava/lang/Object;)V", "Llw5;", "G0", "(Llw5;)Lz61;", "", "T0", "(Ljava/lang/Object;)Ljava/lang/String;", "I", "parent", "w0", "(Ll95;)V", "start", "L0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "q", "()Ljava/util/concurrent/CancellationException;", "message", "U0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lf43;", "r", "(Lkotlin/jvm/functions/Function1;)Lf43;", "invokeImmediately", "o", "(ZZLkotlin/jvm/functions/Function1;)Lf43;", "n", "P0", "a", "(Ljava/util/concurrent/CancellationException;)V", "X", "()Ljava/lang/String;", "R", "(Ljava/lang/Throwable;)V", "parentJob", "j0", "(Lyq7;)V", "Y", "J", "O", "(Ljava/lang/Object;)Z", "M", "C0", "D0", "Ly61;", "n0", "(La71;)Ly61;", "exception", "v0", "J0", "u0", "K0", "(Ljava/lang/Object;)V", "D", "toString", "W0", "F0", "h0", "()Ljava/lang/Object;", "F", "T", "Lv5a;", DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, "Lkotlin/Function2;", "Lcv1;", "block", "O0", "(Lv5a;Lkotlin/jvm/functions/Function2;)V", "Q0", "i0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", Action.KEY_ATTRIBUTE, "value", "s0", "()Ly61;", "R0", "(Ly61;)V", "parentHandle", "t0", "b", "isActive", com.huawei.hms.push.e.a, "isCompleted", "isCancelled", "q0", "onCancelComplete", "Lkotlin/sequences/Sequence;", "l", "()Lkotlin/sequences/Sequence;", "children", "y0", "isScopedCoroutine", "p0", "handlesException", "active", "<init>", "(Z)V", com.huawei.hms.opendevice.c.a, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: v95  reason: default package */
/* loaded from: classes3.dex */
public class v95 implements l95, a71, yq7 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(v95.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lv95$a;", "T", "Lgn0;", "Ll95;", "parent", "", "r", "", "C", "Lv95;", "i", "Lv95;", "job", "Lcv1;", "delegate", "<init>", "(Lcv1;Lv95;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: v95$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends gn0<T> {
        private final v95 i;

        public a(cv1<? super T> cv1Var, v95 v95Var) {
            super(cv1Var, 1);
            this.i = v95Var;
        }

        @Override // defpackage.gn0
        protected String C() {
            return "AwaitContinuation";
        }

        @Override // defpackage.gn0
        public Throwable r(l95 l95Var) {
            Throwable f;
            Object t0 = this.i.t0();
            if ((t0 instanceof c) && (f = ((c) t0).f()) != null) {
                return f;
            }
            if (t0 instanceof il1) {
                return ((il1) t0).a;
            }
            return l95Var.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lv95$b;", "Lu95;", "", "cause", "", "R", "Lv95;", com.huawei.hms.push.e.a, "Lv95;", "parent", "Lv95$c;", "f", "Lv95$c;", "state", "Lz61;", "g", "Lz61;", "child", "", Image.TYPE_HIGH, "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lv95;Lv95$c;Lz61;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: v95$b */
    /* loaded from: classes3.dex */
    public static final class b extends u95 {
        private final v95 e;
        private final c f;
        private final z61 g;
        private final Object h;

        public b(v95 v95Var, c cVar, z61 z61Var, Object obj) {
            this.e = v95Var;
            this.f = cVar;
            this.g = z61Var;
            this.h = obj;
        }

        @Override // defpackage.wl1
        public void R(Throwable th) {
            this.e.a0(this.f, this.g, this.h);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            R(th);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b/\u00100J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0010R\u0011\u0010*\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010,\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!¨\u00061"}, d2 = {"Lv95$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lc05;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", com.huawei.hms.opendevice.c.a, "()Ljava/util/ArrayList;", "proposedException", "", "j", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lsz6;", "Lsz6;", DateTokenConverter.CONVERTER_KEY, "()Lsz6;", StatisticManager.LIST, "value", com.huawei.hms.push.e.a, "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "exceptionsHolder", "", Image.TYPE_HIGH, "()Z", "k", "(Z)V", "isCompleting", "f", "()Ljava/lang/Throwable;", Image.TYPE_MEDIUM, "rootCause", "i", "isSealed", "g", "isCancelling", "b", "isActive", "<init>", "(Lsz6;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: v95$c */
    /* loaded from: classes3.dex */
    public static final class c implements c05 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;
        private final sz6 a;

        public c(sz6 sz6Var, boolean z, Throwable th) {
            this.a = sz6Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object e() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Throwable th) {
            Throwable f = f();
            if (f == null) {
                m(th);
            } else if (th == f) {
            } else {
                Object e = e();
                if (e == null) {
                    l(th);
                } else if (e instanceof Throwable) {
                    if (th == e) {
                        return;
                    }
                    ArrayList<Throwable> c = c();
                    c.add(e);
                    c.add(th);
                    l(c);
                } else if (e instanceof ArrayList) {
                    ((ArrayList) e).add(th);
                } else {
                    throw new IllegalStateException(("State is " + e).toString());
                }
            }
        }

        @Override // defpackage.c05
        public boolean b() {
            if (f() == null) {
                return true;
            }
            return false;
        }

        @Override // defpackage.c05
        public sz6 d() {
            return this.a;
        }

        public final Throwable f() {
            return (Throwable) this._rootCause;
        }

        public final boolean g() {
            if (f() != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean h() {
            return this._isCompleting;
        }

        public final boolean i() {
            r3b r3bVar;
            Object e = e();
            r3bVar = w95.e;
            if (e == r3bVar) {
                return true;
            }
            return false;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            r3b r3bVar;
            Object e = e();
            if (e == null) {
                arrayList = c();
            } else if (e instanceof Throwable) {
                ArrayList<Throwable> c = c();
                c.add(e);
                arrayList = c;
            } else if (e instanceof ArrayList) {
                arrayList = (ArrayList) e;
            } else {
                throw new IllegalStateException(("State is " + e).toString());
            }
            Throwable f = f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th != null && !z65.c(th, f)) {
                arrayList.add(th);
            }
            r3bVar = w95.e;
            l(r3bVar);
            return arrayList;
        }

        public final void k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + d() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"v95$d", "Llw5$b;", "Llw5;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: v95$d */
    /* loaded from: classes3.dex */
    public static final class d extends lw5.b {
        final /* synthetic */ v95 d;
        final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(lw5 lw5Var, v95 v95Var, Object obj) {
            super(lw5Var);
            this.d = v95Var;
            this.e = obj;
        }

        @Override // defpackage.uy
        /* renamed from: k */
        public Object i(lw5 lw5Var) {
            if (this.d.t0() == this.e) {
                return null;
            }
            return kw5.a();
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lxba;", "Ll95;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {952, 954}, m = "invokeSuspend")
    /* renamed from: v95$e */
    /* loaded from: classes3.dex */
    static final class e extends rk9 implements Function2<xba<? super l95>, cv1<? super Unit>, Object> {
        Object b;
        Object c;
        int d;
        private /* synthetic */ Object e;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(xba<? super l95> xbaVar, cv1<? super Unit> cv1Var) {
            return ((e) create(xbaVar, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0068 -> B:27:0x007e). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:27:0x007e). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r7.d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r7.c
                lw5 r1 = (defpackage.lw5) r1
                java.lang.Object r3 = r7.b
                jw5 r3 = (defpackage.jw5) r3
                java.lang.Object r4 = r7.e
                xba r4 = (defpackage.xba) r4
                defpackage.vk9.b(r8)
                r8 = r7
                goto L7e
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                defpackage.vk9.b(r8)
                goto L83
            L2b:
                defpackage.vk9.b(r8)
                java.lang.Object r8 = r7.e
                xba r8 = (defpackage.xba) r8
                v95 r1 = defpackage.v95.this
                java.lang.Object r1 = r1.t0()
                boolean r4 = r1 instanceof defpackage.z61
                if (r4 == 0) goto L49
                z61 r1 = (defpackage.z61) r1
                a71 r1 = r1.e
                r7.d = r3
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r0) goto L83
                return r0
            L49:
                boolean r3 = r1 instanceof defpackage.c05
                if (r3 == 0) goto L83
                c05 r1 = (defpackage.c05) r1
                sz6 r1 = r1.d()
                if (r1 == 0) goto L83
                java.lang.Object r3 = r1.E()
                lw5 r3 = (defpackage.lw5) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L60:
                boolean r5 = defpackage.z65.c(r1, r3)
                if (r5 != 0) goto L83
                boolean r5 = r1 instanceof defpackage.z61
                if (r5 == 0) goto L7e
                r5 = r1
                z61 r5 = (defpackage.z61) r5
                a71 r5 = r5.e
                r8.e = r4
                r8.b = r3
                r8.c = r1
                r8.d = r2
                java.lang.Object r5 = r4.c(r5, r8)
                if (r5 != r0) goto L7e
                return r0
            L7e:
                lw5 r1 = r1.F()
                goto L60
            L83:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.v95.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public v95(boolean z) {
        this._state = z ? w95.g : w95.f;
        this._parentHandle = null;
    }

    private final Object A0(cv1<? super Unit> cv1Var) {
        cv1 c2;
        Object d2;
        Object d3;
        c2 = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c2, 1);
        gn0Var.w();
        in0.a(gn0Var, r(new zk9(gn0Var)));
        Object s = gn0Var.s();
        d2 = c75.d();
        if (s == d2) {
            io2.c(cv1Var);
        }
        d3 = c75.d();
        if (s == d3) {
            return s;
        }
        return Unit.a;
    }

    private final boolean B(Object obj, sz6 sz6Var, u95 u95Var) {
        int Q;
        d dVar = new d(u95Var, this, obj);
        do {
            Q = sz6Var.H().Q(u95Var, sz6Var, dVar);
            if (Q == 1) {
                return true;
            }
        } while (Q != 2);
        return false;
    }

    private final Object B0(Object obj) {
        r3b r3bVar;
        r3b r3bVar2;
        r3b r3bVar3;
        r3b r3bVar4;
        r3b r3bVar5;
        r3b r3bVar6;
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object t0 = t0();
            if (t0 instanceof c) {
                synchronized (t0) {
                    if (((c) t0).i()) {
                        r3bVar2 = w95.d;
                        return r3bVar2;
                    }
                    boolean g = ((c) t0).g();
                    if (obj != null || !g) {
                        if (th2 == null) {
                            th2 = c0(obj);
                        }
                        ((c) t0).a(th2);
                    }
                    Throwable f = ((c) t0).f();
                    if (!g) {
                        th = f;
                    }
                    if (th != null) {
                        H0(((c) t0).d(), th);
                    }
                    r3bVar = w95.a;
                    return r3bVar;
                }
            } else if (!(t0 instanceof c05)) {
                r3bVar3 = w95.d;
                return r3bVar3;
            } else {
                if (th2 == null) {
                    th2 = c0(obj);
                }
                c05 c05Var = (c05) t0;
                if (c05Var.b()) {
                    if (Y0(c05Var, th2)) {
                        r3bVar4 = w95.a;
                        return r3bVar4;
                    }
                } else {
                    Object Z0 = Z0(t0, new il1(th2, false, 2, null));
                    r3bVar5 = w95.a;
                    if (Z0 != r3bVar5) {
                        r3bVar6 = w95.c;
                        if (Z0 != r3bVar6) {
                            return Z0;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + t0).toString());
                    }
                }
            }
        }
    }

    private final void C(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                vl3.a(th, th2);
            }
        }
    }

    private final u95 E0(Function1<? super Throwable, Unit> function1, boolean z) {
        u95 u95Var = null;
        if (z) {
            if (function1 instanceof m95) {
                u95Var = (m95) function1;
            }
            if (u95Var == null) {
                u95Var = new o75(function1);
            }
        } else {
            if (function1 instanceof u95) {
                u95Var = (u95) function1;
            }
            if (u95Var == null) {
                u95Var = new p75(function1);
            }
        }
        u95Var.T(this);
        return u95Var;
    }

    private final z61 G0(lw5 lw5Var) {
        while (lw5Var.K()) {
            lw5Var = lw5Var.H();
        }
        while (true) {
            lw5Var = lw5Var.F();
            if (!lw5Var.K()) {
                if (lw5Var instanceof z61) {
                    return (z61) lw5Var;
                }
                if (lw5Var instanceof sz6) {
                    return null;
                }
            }
        }
    }

    private final void H0(sz6 sz6Var, Throwable th) {
        J0(th);
        CompletionHandlerException completionHandlerException = null;
        for (lw5 lw5Var = (lw5) sz6Var.E(); !z65.c(lw5Var, sz6Var); lw5Var = lw5Var.F()) {
            if (lw5Var instanceof m95) {
                u95 u95Var = (u95) lw5Var;
                try {
                    u95Var.R(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        vl3.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + u95Var + " for " + this, th2);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            v0(completionHandlerException);
        }
        V(th);
    }

    private final Object I(cv1<Object> cv1Var) {
        cv1 c2;
        Object d2;
        c2 = b75.c(cv1Var);
        a aVar = new a(c2, this);
        aVar.w();
        in0.a(aVar, r(new yk9(aVar)));
        Object s = aVar.s();
        d2 = c75.d();
        if (s == d2) {
            io2.c(cv1Var);
        }
        return s;
    }

    private final void I0(sz6 sz6Var, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (lw5 lw5Var = (lw5) sz6Var.E(); !z65.c(lw5Var, sz6Var); lw5Var = lw5Var.F()) {
            if (lw5Var instanceof u95) {
                u95 u95Var = (u95) lw5Var;
                try {
                    u95Var.R(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        vl3.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + u95Var + " for " + this, th2);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            v0(completionHandlerException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [zz4] */
    private final void M0(eg3 eg3Var) {
        sz6 sz6Var = new sz6();
        if (!eg3Var.b()) {
            sz6Var = new zz4(sz6Var);
        }
        d2.a(a, this, eg3Var, sz6Var);
    }

    private final void N0(u95 u95Var) {
        u95Var.A(new sz6());
        d2.a(a, this, u95Var, u95Var.F());
    }

    private final int S0(Object obj) {
        eg3 eg3Var;
        if (obj instanceof eg3) {
            if (((eg3) obj).b()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            eg3Var = w95.g;
            if (!d2.a(atomicReferenceFieldUpdater, this, obj, eg3Var)) {
                return -1;
            }
            L0();
            return 1;
        } else if (!(obj instanceof zz4)) {
            return 0;
        } else {
            if (!d2.a(a, this, obj, ((zz4) obj).d())) {
                return -1;
            }
            L0();
            return 1;
        }
    }

    private final String T0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.g()) {
                return "Cancelling";
            }
            if (!cVar.h()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof c05) {
            if (((c05) obj).b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof il1) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    private final Object U(Object obj) {
        r3b r3bVar;
        Object Z0;
        r3b r3bVar2;
        do {
            Object t0 = t0();
            if (!(t0 instanceof c05) || ((t0 instanceof c) && ((c) t0).h())) {
                r3bVar = w95.a;
                return r3bVar;
            }
            Z0 = Z0(t0, new il1(c0(obj), false, 2, null));
            r3bVar2 = w95.c;
        } while (Z0 == r3bVar2);
        return Z0;
    }

    private final boolean V(Throwable th) {
        if (y0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        y61 s0 = s0();
        if (s0 != null && s0 != yz6.a) {
            if (s0.h(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static /* synthetic */ CancellationException V0(v95 v95Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return v95Var.U0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean X0(c05 c05Var, Object obj) {
        if (!d2.a(a, this, c05Var, w95.g(obj))) {
            return false;
        }
        J0(null);
        K0(obj);
        Z(c05Var, obj);
        return true;
    }

    private final boolean Y0(c05 c05Var, Throwable th) {
        sz6 r0 = r0(c05Var);
        if (r0 == null) {
            return false;
        }
        if (!d2.a(a, this, c05Var, new c(r0, false, th))) {
            return false;
        }
        H0(r0, th);
        return true;
    }

    private final void Z(c05 c05Var, Object obj) {
        il1 il1Var;
        y61 s0 = s0();
        if (s0 != null) {
            s0.a();
            R0(yz6.a);
        }
        Throwable th = null;
        if (obj instanceof il1) {
            il1Var = (il1) obj;
        } else {
            il1Var = null;
        }
        if (il1Var != null) {
            th = il1Var.a;
        }
        if (c05Var instanceof u95) {
            try {
                ((u95) c05Var).R(th);
                return;
            } catch (Throwable th2) {
                v0(new CompletionHandlerException("Exception in completion handler " + c05Var + " for " + this, th2));
                return;
            }
        }
        sz6 d2 = c05Var.d();
        if (d2 != null) {
            I0(d2, th);
        }
    }

    private final Object Z0(Object obj, Object obj2) {
        r3b r3bVar;
        r3b r3bVar2;
        if (!(obj instanceof c05)) {
            r3bVar2 = w95.a;
            return r3bVar2;
        } else if (((obj instanceof eg3) || (obj instanceof u95)) && !(obj instanceof z61) && !(obj2 instanceof il1)) {
            if (!X0((c05) obj, obj2)) {
                r3bVar = w95.c;
                return r3bVar;
            }
            return obj2;
        } else {
            return a1((c05) obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(c cVar, z61 z61Var, Object obj) {
        z61 G0 = G0(z61Var);
        if (G0 != null && b1(cVar, G0, obj)) {
            return;
        }
        D(d0(cVar, obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object a1(c05 c05Var, Object obj) {
        c cVar;
        il1 il1Var;
        r3b r3bVar;
        r3b r3bVar2;
        r3b r3bVar3;
        sz6 r0 = r0(c05Var);
        if (r0 == null) {
            r3bVar3 = w95.c;
            return r3bVar3;
        }
        ?? r2 = 0;
        if (c05Var instanceof c) {
            cVar = (c) c05Var;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(r0, false, null);
        }
        ea9 ea9Var = new ea9();
        synchronized (cVar) {
            if (cVar.h()) {
                r3bVar2 = w95.a;
                return r3bVar2;
            }
            cVar.k(true);
            if (cVar != c05Var && !d2.a(a, this, c05Var, cVar)) {
                r3bVar = w95.c;
                return r3bVar;
            }
            boolean g = cVar.g();
            if (obj instanceof il1) {
                il1Var = (il1) obj;
            } else {
                il1Var = null;
            }
            if (il1Var != null) {
                cVar.a(il1Var.a);
            }
            Throwable f = cVar.f();
            if (Boolean.valueOf(true ^ g).booleanValue()) {
                r2 = f;
            }
            ea9Var.a = r2;
            Unit unit = Unit.a;
            if (r2 != 0) {
                H0(r0, r2);
            }
            z61 g0 = g0(c05Var);
            if (g0 != null && b1(cVar, g0, obj)) {
                return w95.b;
            }
            return d0(cVar, obj);
        }
    }

    private final boolean b1(c cVar, z61 z61Var, Object obj) {
        while (l95.a.d(z61Var.e, false, false, new b(this, cVar, z61Var, obj), 1, null) == yz6.a) {
            z61Var = G0(z61Var);
            if (z61Var == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable c0(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(X(), null, this);
            }
            return th;
        } else if (obj != null) {
            return ((yq7) obj).M();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    private final Object d0(c cVar, Object obj) {
        il1 il1Var;
        Throwable th;
        boolean g;
        Throwable k0;
        if (obj instanceof il1) {
            il1Var = (il1) obj;
        } else {
            il1Var = null;
        }
        if (il1Var != null) {
            th = il1Var.a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            g = cVar.g();
            List<Throwable> j = cVar.j(th);
            k0 = k0(cVar, j);
            if (k0 != null) {
                C(k0, j);
            }
        }
        if (k0 != null && k0 != th) {
            obj = new il1(k0, false, 2, null);
        }
        if (k0 != null && (V(k0) || u0(k0))) {
            if (obj != null) {
                ((il1) obj).b();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
        }
        if (!g) {
            J0(k0);
        }
        K0(obj);
        d2.a(a, this, cVar, w95.g(obj));
        Z(cVar, obj);
        return obj;
    }

    private final z61 g0(c05 c05Var) {
        z61 z61Var;
        if (c05Var instanceof z61) {
            z61Var = (z61) c05Var;
        } else {
            z61Var = null;
        }
        if (z61Var == null) {
            sz6 d2 = c05Var.d();
            if (d2 == null) {
                return null;
            }
            return G0(d2);
        }
        return z61Var;
    }

    private final Throwable i0(Object obj) {
        il1 il1Var;
        if (obj instanceof il1) {
            il1Var = (il1) obj;
        } else {
            il1Var = null;
        }
        if (il1Var == null) {
            return null;
        }
        return il1Var.a;
    }

    private final Throwable k0(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!cVar.g()) {
                return null;
            }
            return new JobCancellationException(X(), null, this);
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private final sz6 r0(c05 c05Var) {
        sz6 d2 = c05Var.d();
        if (d2 == null) {
            if (c05Var instanceof eg3) {
                return new sz6();
            }
            if (c05Var instanceof u95) {
                N0((u95) c05Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + c05Var).toString());
        }
        return d2;
    }

    private final boolean z0() {
        Object t0;
        do {
            t0 = t0();
            if (!(t0 instanceof c05)) {
                return false;
            }
        } while (S0(t0) < 0);
        return true;
    }

    public final boolean C0(Object obj) {
        Object Z0;
        r3b r3bVar;
        r3b r3bVar2;
        do {
            Z0 = Z0(t0(), obj);
            r3bVar = w95.a;
            if (Z0 == r3bVar) {
                return false;
            }
            if (Z0 != w95.b) {
                r3bVar2 = w95.c;
            } else {
                return true;
            }
        } while (Z0 == r3bVar2);
        D(Z0);
        return true;
    }

    public final Object D0(Object obj) {
        Object Z0;
        r3b r3bVar;
        r3b r3bVar2;
        do {
            Z0 = Z0(t0(), obj);
            r3bVar = w95.a;
            if (Z0 != r3bVar) {
                r3bVar2 = w95.c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, i0(obj));
            }
        } while (Z0 == r3bVar2);
        return Z0;
    }

    public final Object F(cv1<Object> cv1Var) {
        Object t0;
        do {
            t0 = t0();
            if (!(t0 instanceof c05)) {
                if (!(t0 instanceof il1)) {
                    return w95.h(t0);
                }
                throw ((il1) t0).a;
            }
        } while (S0(t0) < 0);
        return I(cv1Var);
    }

    public String F0() {
        return jo2.a(this);
    }

    public final boolean J(Throwable th) {
        return O(th);
    }

    @Override // defpackage.yq7
    public CancellationException M() {
        Throwable th;
        Object t0 = t0();
        CancellationException cancellationException = null;
        if (t0 instanceof c) {
            th = ((c) t0).f();
        } else if (t0 instanceof il1) {
            th = ((il1) t0).a;
        } else if (!(t0 instanceof c05)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + t0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is " + T0(t0), th, this);
        }
        return cancellationException;
    }

    public final boolean O(Object obj) {
        Object obj2;
        r3b r3bVar;
        r3b r3bVar2;
        r3b r3bVar3;
        obj2 = w95.a;
        if (!q0() || (obj2 = U(obj)) != w95.b) {
            r3bVar = w95.a;
            if (obj2 == r3bVar) {
                obj2 = B0(obj);
            }
            r3bVar2 = w95.a;
            if (obj2 != r3bVar2 && obj2 != w95.b) {
                r3bVar3 = w95.d;
                if (obj2 == r3bVar3) {
                    return false;
                }
                D(obj2);
                return true;
            }
            return true;
        }
        return true;
    }

    public final <T, R> void O0(v5a<? super R> v5aVar, Function2<? super T, ? super cv1<? super R>, ? extends Object> function2) {
        Object t0;
        do {
            t0 = t0();
            if (v5aVar.g()) {
                return;
            }
            if (!(t0 instanceof c05)) {
                if (v5aVar.o()) {
                    if (t0 instanceof il1) {
                        v5aVar.s(((il1) t0).a);
                        return;
                    } else {
                        kqb.c(function2, w95.h(t0), v5aVar.p());
                        return;
                    }
                }
                return;
            }
        } while (S0(t0) != 0);
        v5aVar.j(r(new g4a(v5aVar, function2)));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return l95.a.f(this, coroutineContext);
    }

    public final void P0(u95 u95Var) {
        Object t0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        eg3 eg3Var;
        do {
            t0 = t0();
            if (t0 instanceof u95) {
                if (t0 != u95Var) {
                    return;
                }
                atomicReferenceFieldUpdater = a;
                eg3Var = w95.g;
            } else if ((t0 instanceof c05) && ((c05) t0).d() != null) {
                u95Var.M();
                return;
            } else {
                return;
            }
        } while (!d2.a(atomicReferenceFieldUpdater, this, t0, eg3Var));
    }

    public final <T, R> void Q0(v5a<? super R> v5aVar, Function2<? super T, ? super cv1<? super R>, ? extends Object> function2) {
        Object t0 = t0();
        if (t0 instanceof il1) {
            v5aVar.s(((il1) t0).a);
        } else {
            jn0.e(function2, w95.h(t0), v5aVar.p(), null, 4, null);
        }
    }

    public void R(Throwable th) {
        O(th);
    }

    public final void R0(y61 y61Var) {
        this._parentHandle = y61Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext T(CoroutineContext.b<?> bVar) {
        return l95.a.e(this, bVar);
    }

    protected final CancellationException U0(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = X();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public final String W0() {
        return F0() + CoreConstants.CURLY_LEFT + T0(t0()) + CoreConstants.CURLY_RIGHT;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String X() {
        return "Job was cancelled";
    }

    public boolean Y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (O(th) && p0()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.l95, defpackage.a99
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(X(), null, this);
        }
        R(cancellationException);
    }

    @Override // defpackage.l95
    public boolean b() {
        Object t0 = t0();
        if ((t0 instanceof c05) && ((c05) t0).b()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E c(CoroutineContext.b<E> bVar) {
        return (E) l95.a.c(this, bVar);
    }

    @Override // defpackage.l95
    public final boolean e() {
        return !(t0() instanceof c05);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.b<?> getKey() {
        return l95.M;
    }

    public final Object h0() {
        Object t0 = t0();
        if (!(t0 instanceof c05)) {
            if (!(t0 instanceof il1)) {
                return w95.h(t0);
            }
            throw ((il1) t0).a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    @Override // defpackage.l95
    public final boolean isCancelled() {
        Object t0 = t0();
        if (!(t0 instanceof il1) && (!(t0 instanceof c) || !((c) t0).g())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.a71
    public final void j0(yq7 yq7Var) {
        O(yq7Var);
    }

    @Override // defpackage.l95
    public final Sequence<l95> l() {
        return yba.b(new e(null));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R m0(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) l95.a.b(this, r, function2);
    }

    @Override // defpackage.l95
    public final Object n(cv1<? super Unit> cv1Var) {
        Object d2;
        if (!z0()) {
            q95.k(cv1Var.getContext());
            return Unit.a;
        }
        Object A0 = A0(cv1Var);
        d2 = c75.d();
        if (A0 == d2) {
            return A0;
        }
        return Unit.a;
    }

    @Override // defpackage.l95
    public final y61 n0(a71 a71Var) {
        return (y61) l95.a.d(this, true, false, new z61(a71Var), 2, null);
    }

    @Override // defpackage.l95
    public final f43 o(boolean z, boolean z2, Function1<? super Throwable, Unit> function1) {
        il1 il1Var;
        u95 E0 = E0(function1, z);
        while (true) {
            Object t0 = t0();
            if (t0 instanceof eg3) {
                eg3 eg3Var = (eg3) t0;
                if (eg3Var.b()) {
                    if (d2.a(a, this, t0, E0)) {
                        return E0;
                    }
                } else {
                    M0(eg3Var);
                }
            } else {
                Throwable th = null;
                if (t0 instanceof c05) {
                    sz6 d2 = ((c05) t0).d();
                    if (d2 == null) {
                        if (t0 != null) {
                            N0((u95) t0);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        }
                    } else {
                        f43 f43Var = yz6.a;
                        if (z && (t0 instanceof c)) {
                            synchronized (t0) {
                                try {
                                    th = ((c) t0).f();
                                    if (th != null) {
                                        if ((function1 instanceof z61) && !((c) t0).h()) {
                                        }
                                        Unit unit = Unit.a;
                                    }
                                    if (B(t0, d2, E0)) {
                                        if (th == null) {
                                            return E0;
                                        }
                                        f43Var = E0;
                                        Unit unit2 = Unit.a;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                function1.invoke(th);
                            }
                            return f43Var;
                        } else if (B(t0, d2, E0)) {
                            return E0;
                        }
                    }
                } else {
                    if (z2) {
                        if (t0 instanceof il1) {
                            il1Var = (il1) t0;
                        } else {
                            il1Var = null;
                        }
                        if (il1Var != null) {
                            th = il1Var.a;
                        }
                        function1.invoke(th);
                    }
                    return yz6.a;
                }
            }
        }
    }

    public boolean p0() {
        return true;
    }

    @Override // defpackage.l95
    public final CancellationException q() {
        Object t0 = t0();
        if (t0 instanceof c) {
            Throwable f = ((c) t0).f();
            if (f != null) {
                CancellationException U0 = U0(f, jo2.a(this) + " is cancelling");
                if (U0 != null) {
                    return U0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(t0 instanceof c05)) {
            if (t0 instanceof il1) {
                return V0(this, ((il1) t0).a, null, 1, null);
            }
            return new JobCancellationException(jo2.a(this) + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public boolean q0() {
        return false;
    }

    @Override // defpackage.l95
    public final f43 r(Function1<? super Throwable, Unit> function1) {
        return o(false, true, function1);
    }

    public final y61 s0() {
        return (y61) this._parentHandle;
    }

    @Override // defpackage.l95
    public final boolean start() {
        int S0;
        do {
            S0 = S0(t0());
            if (S0 == 0) {
                return false;
            }
        } while (S0 != 1);
        return true;
    }

    public final Object t0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof ea7)) {
                return obj;
            }
            ((ea7) obj).c(this);
        }
    }

    public String toString() {
        return W0() + '@' + jo2.b(this);
    }

    protected boolean u0(Throwable th) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w0(l95 l95Var) {
        if (l95Var == null) {
            R0(yz6.a);
            return;
        }
        l95Var.start();
        y61 n0 = l95Var.n0(this);
        R0(n0);
        if (e()) {
            n0.a();
            R0(yz6.a);
        }
    }

    protected boolean y0() {
        return false;
    }

    protected void L0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D(Object obj) {
    }

    protected void J0(Throwable th) {
    }

    protected void K0(Object obj) {
    }

    public void v0(Throwable th) {
        throw th;
    }
}
