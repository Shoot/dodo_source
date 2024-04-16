package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.qn1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0015\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 ¹\u00012\u00020\u0001:\u0001zB\u0011\u0012\u0006\u0010q\u001a\u00020p¢\u0006\u0006\b·\u0001\u0010¸\u0001J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u001c\u001a\u00020\bH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002J \u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010%\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002J\u0018\u0010(\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H\u0002J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J \u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002H\u0002J\u0014\u00102\u001a\u00020\u0002*\u0002012\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00103\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0014\u00105\u001a\u00020\u0002*\u0002012\u0006\u00104\u001a\u00020\u0002H\u0002J\u0014\u00106\u001a\u00020\u0002*\u0002012\u0006\u00104\u001a\u00020\u0002H\u0002J\u001c\u00107\u001a\u00020\b*\u0002012\u0006\u00104\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0002H\u0002J\u0014\u00108\u001a\u00020\u0002*\u0002012\u0006\u00104\u001a\u00020\u0002H\u0002J\u0014\u00109\u001a\u00020\u0002*\u0002012\u0006\u00104\u001a\u00020\u0002H\u0002J(\u0010<\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0002H\u0002J \u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0002H\u0002J\u0018\u0010?\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0002H\u0002J\u0010\u0010@\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u000e\u0010A\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010B\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010C\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010D\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010E\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010F\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010G\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010H\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u0016\u0010I\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0010\u0010J\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020KJ\u000e\u0010M\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010N\u001a\u00020\bJ\u0006\u0010O\u001a\u00020\bJ\u0012\u0010P\u001a\u0004\u0018\u00010\u00012\b\u0010$\u001a\u0004\u0018\u00010\u0001J\u0010\u0010Q\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001J\u0010\u0010R\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001J\u0018\u0010S\u001a\u00020\b2\u0006\u0010=\u001a\u00020K2\b\u0010$\u001a\u0004\u0018\u00010\u0001J\u0010\u0010T\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001J\u001a\u0010U\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001J\b\u0010V\u001a\u0004\u0018\u00010\u0001J\u0018\u0010W\u001a\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020K2\u0006\u0010\u0019\u001a\u00020\u0002J\u0018\u0010Y\u001a\u0004\u0018\u00010\u00012\u0006\u0010X\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010[\u001a\u00020\b2\u0006\u0010Z\u001a\u00020\u0002J\u0006\u0010\\\u001a\u00020\bJ\u0006\u0010]\u001a\u00020\bJ\u0006\u0010^\u001a\u00020\bJ\u0006\u0010_\u001a\u00020\bJ\u0018\u0010a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010`\u001a\u0004\u0018\u00010\u0001J\u0018\u0010b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\"\u0010c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0006\u0010d\u001a\u00020\u0002J\u000e\u0010e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010f\u001a\u00020\b2\u0006\u0010=\u001a\u00020KJ\u0006\u0010g\u001a\u00020\u0002J\u0006\u0010h\u001a\u00020\u0005J\u000e\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010iJ\u000e\u0010l\u001a\u00020\b2\u0006\u0010k\u001a\u00020\u0002J$\u0010o\u001a\b\u0012\u0004\u0012\u00020K0n2\u0006\u0010=\u001a\u00020K2\u0006\u0010k\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\u0000J&\u0010s\u001a\b\u0012\u0004\u0012\u00020K0n2\u0006\u0010q\u001a\u00020p2\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010r\u001a\u00020\u0005J$\u0010t\u001a\b\u0012\u0004\u0012\u00020K0n2\u0006\u0010k\u001a\u00020\u00022\u0006\u0010q\u001a\u00020p2\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010u\u001a\u00020K2\b\b\u0002\u0010\u0019\u001a\u00020\u0002J\u0010\u0010v\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002J\u000e\u0010w\u001a\u00020\u00022\u0006\u0010=\u001a\u00020KJ\b\u0010y\u001a\u00020xH\u0016R\u001a\u0010q\u001a\u00020p8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0017\u0010\u0080\u0001\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\"\u0010\u0084\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R+\u0010\u0089\u0001\u001a\u0014\u0012\u0004\u0012\u00020K0\u0085\u0001j\t\u0012\u0004\u0012\u00020K`\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u000bR\u0018\u0010\u008d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u000bR\u0018\u0010\u008f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u000bR\u0018\u0010\u0091\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010\u000bR\u0018\u0010\u0093\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010\u000bR\u0018\u0010\u0095\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\u000bR\u0018\u0010\u0097\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010\u000bR\u0018\u0010\u0099\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010\u000bR\u0018\u0010\u009b\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010\u000bR\u0018\u0010\u009d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010\u000bR\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010£\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010 \u0001R)\u0010ª\u0001\u001a\u00020\u00022\u0007\u0010¦\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b§\u0001\u0010\u000b\u001a\u0006\b¨\u0001\u0010©\u0001R(\u0010\u0015\u001a\u00020\u00022\u0007\u0010¦\u0001\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b«\u0001\u0010\u000b\u001a\u0006\b¬\u0001\u0010©\u0001R)\u0010°\u0001\u001a\u00020\u00052\u0007\u0010¦\u0001\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u00ad\u0001\u0010F\u001a\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010³\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010;\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010©\u0001R\u0013\u0010\u0006\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\bµ\u0001\u0010¯\u0001R\u0016\u0010\u001d\u001a\u00020\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010©\u0001¨\u0006º\u0001"}, d2 = {"Lzna;", "", "", Action.KEY_ATTRIBUTE, "objectKey", "", "isNode", "aux", "", "W0", "group", "I", "H", "D0", "b1", "Lbk8;", "set", "c1", "E", "K0", "J0", "parent", "endGroup", "firstChild", "S", "index", "r0", "t0", "F", "size", "i0", "j0", "start", "len", "G0", "H0", "value", "g1", "previousGapStart", "newGapStart", "Z0", "gapStart", "E0", "originalLocation", "newLocation", "o0", "a0", "dataIndex", "M", "", "A0", "K", "address", "L", "S0", "d1", "y0", "C", "gapLen", "capacity", "N", "anchor", "J", "C0", "B0", "l0", "x0", "b0", "c0", "d0", "Z", "h0", "f0", "g0", "v0", "Lrd;", "w0", "z0", "G", "I0", "Y0", "a1", "f1", "e1", "M0", "L0", "N0", "R0", "groupIndex", "Q0", "amount", "z", "P0", "D", "P", "U0", "dataKey", "V0", "X0", "T0", "O", "Q", "R", "O0", "F0", "", "e0", "offset", "q0", "writer", "", "u0", "Lwna;", "table", "removeSourceGroup", "p0", "s0", "A", "m0", "B", "", "toString", "a", "Lwna;", "Y", "()Lwna;", "b", "[I", "groups", "", c.a, "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/ArrayList;", "anchors", e.a, "groupGapStart", "f", "groupGapLen", "g", "currentGroupEnd", Image.TYPE_HIGH, "currentSlot", "i", "currentSlotEnd", "j", "slotsGapStart", "k", "slotsGapLen", "l", "slotsGapOwner", Image.TYPE_MEDIUM, "insertCount", "n", "nodeCount", "Lz55;", "o", "Lz55;", "startStack", "p", "endStack", "q", "nodeCountStack", "<set-?>", "r", "V", "()I", "currentGroup", Image.TYPE_SMALL, "W", "t", "U", "()Z", "closed", "u", "Lbk8;", "pendingRecalculateMarks", "T", "k0", "X", "<init>", "(Lwna;)V", "v", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zna  reason: default package */
/* loaded from: classes.dex */
public final class zna {
    public static final a v = new a(null);
    private final wna a;
    private int[] b;
    private Object[] c;
    private ArrayList<rd> d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private final z55 o;
    private final z55 p;
    private final z55 q;
    private int r;
    private int s;
    private boolean t;
    private bk8 u;

    /* compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\u0010"}, d2 = {"Lzna$a;", "", "Lzna;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "Lrd;", "b", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zna$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<rd> b(zna znaVar, int i, zna znaVar2, boolean z, boolean z2, boolean z3) {
            boolean z4;
            List<rd> l;
            ArrayList arrayList;
            int i2;
            int i3;
            int i4;
            int d0 = znaVar.d0(i);
            int i5 = i + d0;
            int K = znaVar.K(i);
            int K2 = znaVar.K(i5);
            int i6 = K2 - K;
            boolean H = znaVar.H(i);
            znaVar2.i0(d0);
            znaVar2.j0(i6, znaVar2.V());
            if (znaVar.e < i5) {
                znaVar.r0(i5);
            }
            if (znaVar.j < K2) {
                znaVar.t0(K2, i5);
            }
            int[] iArr = znaVar2.b;
            int V = znaVar2.V();
            xr.f(znaVar.b, iArr, V * 5, i * 5, i5 * 5);
            Object[] objArr = znaVar2.c;
            int i7 = znaVar2.h;
            xr.h(znaVar.c, objArr, i7, K, K2);
            int W = znaVar2.W();
            yna.z(iArr, V, W);
            int i8 = V - i;
            int i9 = V + d0;
            int L = i7 - znaVar2.L(iArr, V);
            int i10 = znaVar2.l;
            int i11 = znaVar2.k;
            int length = objArr.length;
            int i12 = i10;
            int i13 = V;
            while (true) {
                z4 = false;
                if (i13 >= i9) {
                    break;
                }
                if (i13 != V) {
                    i2 = i9;
                    yna.z(iArr, i13, yna.r(iArr, i13) + i8);
                } else {
                    i2 = i9;
                }
                int L2 = znaVar2.L(iArr, i13) + L;
                if (i12 < i13) {
                    i3 = L;
                    i4 = 0;
                } else {
                    i3 = L;
                    i4 = znaVar2.j;
                }
                yna.v(iArr, i13, znaVar2.N(L2, i4, i11, length));
                if (i13 == i12) {
                    i12++;
                }
                i13++;
                L = i3;
                i9 = i2;
            }
            int i14 = i9;
            znaVar2.l = i12;
            int n = yna.n(znaVar.d, i, znaVar.X());
            int n2 = yna.n(znaVar.d, i5, znaVar.X());
            if (n < n2) {
                ArrayList arrayList2 = znaVar.d;
                ArrayList arrayList3 = new ArrayList(n2 - n);
                for (int i15 = n; i15 < n2; i15++) {
                    Object obj = arrayList2.get(i15);
                    z65.g(obj, "sourceAnchors[anchorIndex]");
                    rd rdVar = (rd) obj;
                    rdVar.c(rdVar.a() + i8);
                    arrayList3.add(rdVar);
                }
                znaVar2.d.addAll(yna.n(znaVar2.d, znaVar2.V(), znaVar2.X()), arrayList3);
                arrayList2.subList(n, n2).clear();
                arrayList = arrayList3;
            } else {
                l = kc1.l();
                arrayList = l;
            }
            int z0 = znaVar.z0(i);
            int i16 = 1;
            if (z3) {
                if (!z) {
                    z4 = znaVar.G0(i, d0);
                    znaVar.H0(K, i6, i - 1);
                } else {
                    if (z0 >= 0) {
                        z4 = true;
                    }
                    if (z4) {
                        znaVar.U0();
                        znaVar.z(z0 - znaVar.V());
                        znaVar.U0();
                    }
                    znaVar.z(i - znaVar.V());
                    boolean F0 = znaVar.F0();
                    if (z4) {
                        znaVar.P0();
                        znaVar.O();
                        znaVar.P0();
                        znaVar.O();
                    }
                    z4 = F0;
                }
            }
            if (!z4) {
                int i17 = znaVar2.n;
                if (!yna.l(iArr, V)) {
                    i16 = yna.o(iArr, V);
                }
                znaVar2.n = i17 + i16;
                if (z2) {
                    znaVar2.r = i14;
                    znaVar2.h = i7 + i6;
                }
                if (H) {
                    znaVar2.b1(W);
                }
                return arrayList;
            }
            tn1.w("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }

        static /* synthetic */ List c(a aVar, zna znaVar, int i, zna znaVar2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            boolean z4;
            if ((i2 & 32) != 0) {
                z4 = true;
            } else {
                z4 = z3;
            }
            return aVar.b(znaVar, i, znaVar2, z, z2, z4);
        }
    }

    /* compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"zna$b", "", "", "", "hasNext", StatisticManager.NEXT, "", "a", "I", "getCurrent", "()I", "setCurrent", "(I)V", "current", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zna$b */
    /* loaded from: classes.dex */
    public static final class b implements Iterator<Object>, be5 {
        private int a;
        final /* synthetic */ int b;
        final /* synthetic */ zna c;

        b(int i, int i2, zna znaVar) {
            this.b = i2;
            this.c = znaVar;
            this.a = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a < this.b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object[] objArr = this.c.c;
                zna znaVar = this.c;
                int i = this.a;
                this.a = i + 1;
                return objArr[znaVar.M(i)];
            }
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public zna(wna wnaVar) {
        z65.h(wnaVar, "table");
        this.a = wnaVar;
        this.b = wnaVar.u();
        this.c = wnaVar.x();
        this.d = wnaVar.t();
        this.e = wnaVar.v();
        this.f = (this.b.length / 5) - wnaVar.v();
        this.g = wnaVar.v();
        this.j = wnaVar.z();
        this.k = this.c.length - wnaVar.z();
        this.l = wnaVar.v();
        this.o = new z55();
        this.p = new z55();
        this.q = new z55();
        this.s = -1;
    }

    private final int A0(int[] iArr, int i) {
        return B0(yna.r(iArr, a0(i)));
    }

    private final int B0(int i) {
        if (i <= -2) {
            return X() + i + 2;
        }
        return i;
    }

    private final int C(int[] iArr, int i) {
        return L(iArr, i) + yna.d(yna.f(iArr, i) >> 29);
    }

    private final int C0(int i, int i2) {
        if (i >= i2) {
            return -((X() - i) + 2);
        }
        return i;
    }

    private final void D0() {
        bk8 bk8Var = this.u;
        if (bk8Var != null) {
            while (bk8Var.b()) {
                c1(bk8Var.d(), bk8Var);
            }
        }
    }

    private final boolean E(int i) {
        int i2 = i + 1;
        int d0 = i + d0(i);
        while (i2 < d0) {
            if (yna.b(this.b, a0(i2))) {
                return true;
            }
            i2 += d0(i2);
        }
        return false;
    }

    private final boolean E0(int i, int i2) {
        int i3 = i2 + i;
        int n = yna.n(this.d, i3, T() - this.f);
        if (n >= this.d.size()) {
            n--;
        }
        int i4 = n + 1;
        boolean z = false;
        int i5 = 0;
        while (n >= 0) {
            rd rdVar = this.d.get(n);
            z65.g(rdVar, "anchors[index]");
            rd rdVar2 = rdVar;
            int B = B(rdVar2);
            if (B < i) {
                break;
            }
            if (B < i3) {
                rdVar2.c(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = n + 1;
                }
                i4 = n;
            }
            n--;
        }
        if (i4 < i5) {
            z = true;
        }
        if (z) {
            this.d.subList(i4, i5).clear();
        }
        return z;
    }

    private final void F() {
        int i = this.j;
        xr.q(this.c, null, i, this.k + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G0(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<rd> arrayList = this.d;
            r0(i);
            if (!arrayList.isEmpty()) {
                z = E0(i, i2);
            }
            this.e = i;
            this.f += i2;
            int i3 = this.l;
            if (i3 > i) {
                this.l = Math.max(i, i3 - i2);
            }
            int i4 = this.g;
            if (i4 >= this.e) {
                this.g = i4 - i2;
            }
            if (I(this.s)) {
                b1(this.s);
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean H(int i) {
        if (i >= 0 && yna.b(this.b, a0(i))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.k;
            int i5 = i + i2;
            t0(i5, i3);
            this.j = i;
            this.k = i4 + i2;
            xr.q(this.c, null, i, i5);
            int i6 = this.i;
            if (i6 >= i) {
                this.i = i6 - i2;
            }
        }
    }

    private final boolean I(int i) {
        if (i >= 0 && yna.c(this.b, a0(i))) {
            return true;
        }
        return false;
    }

    private final int J(int i, int i2, int i3) {
        if (i < 0) {
            return (i3 - i2) + i + 1;
        }
        return i;
    }

    private final int J0() {
        int T = (T() - this.f) - this.p.h();
        this.g = T;
        return T;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int K(int i) {
        return L(this.b, a0(i));
    }

    private final void K0() {
        this.p.i((T() - this.f) - this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int L(int[] iArr, int i) {
        if (i >= T()) {
            return this.c.length - this.k;
        }
        return J(yna.e(iArr, i), this.k, this.c.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int M(int i) {
        if (i >= this.j) {
            return i + this.k;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int N(int i, int i2, int i3, int i4) {
        if (i > i2) {
            return -(((i4 - i3) - i) + 1);
        }
        return i;
    }

    private final void S(int i, int i2, int i3) {
        int C0 = C0(i, this.e);
        while (i3 < i2) {
            yna.z(this.b, a0(i3), C0);
            int g = yna.g(this.b, a0(i3)) + i3;
            S(i3, g, i3 + 1);
            i3 = g;
        }
    }

    private final int S0(int[] iArr, int i) {
        if (i >= T()) {
            return this.c.length - this.k;
        }
        return J(yna.t(iArr, i), this.k, this.c.length);
    }

    private final int T() {
        return this.b.length / 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void W0(int i, Object obj, boolean z, Object obj2) {
        boolean z2;
        int g;
        int i2;
        int i3;
        if (this.m > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.q.i(this.n);
        if (z2) {
            i0(1);
            int i4 = this.r;
            int a0 = a0(i4);
            qn1.a aVar = qn1.a;
            if (obj != aVar.a()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (!z && obj2 != aVar.a()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            yna.k(this.b, a0, i, z, i2, i3, this.s, this.h);
            this.i = this.h;
            int i5 = (z ? 1 : 0) + i2 + i3;
            if (i5 > 0) {
                j0(i5, i4);
                Object[] objArr = this.c;
                int i6 = this.h;
                if (z) {
                    objArr[i6] = obj2;
                    i6++;
                }
                if (i2 != 0) {
                    objArr[i6] = obj;
                    i6++;
                }
                if (i3 != 0) {
                    objArr[i6] = obj2;
                    i6++;
                }
                this.h = i6;
            }
            this.n = 0;
            g = i4 + 1;
            this.s = i4;
            this.r = g;
        } else {
            this.o.i(this.s);
            K0();
            int i7 = this.r;
            int a02 = a0(i7);
            if (!z65.c(obj2, qn1.a.a())) {
                if (z) {
                    f1(obj2);
                } else {
                    a1(obj2);
                }
            }
            this.h = S0(this.b, a02);
            this.i = L(this.b, a0(this.r + 1));
            this.n = yna.o(this.b, a02);
            this.s = i7;
            this.r = i7 + 1;
            g = i7 + yna.g(this.b, a02);
        }
        this.g = g;
    }

    private final void Z0(int i, int i2) {
        int i3;
        int T = T() - this.f;
        if (i < i2) {
            for (int n = yna.n(this.d, i, T); n < this.d.size(); n++) {
                rd rdVar = this.d.get(n);
                z65.g(rdVar, "anchors[index]");
                rd rdVar2 = rdVar;
                int a2 = rdVar2.a();
                if (a2 < 0 && (i3 = a2 + T) < i2) {
                    rdVar2.c(i3);
                } else {
                    return;
                }
            }
            return;
        }
        for (int n2 = yna.n(this.d, i2, T); n2 < this.d.size(); n2++) {
            rd rdVar3 = this.d.get(n2);
            z65.g(rdVar3, "anchors[index]");
            rd rdVar4 = rdVar3;
            int a3 = rdVar4.a();
            if (a3 >= 0) {
                rdVar4.c(-(T - a3));
            } else {
                return;
            }
        }
    }

    private final int a0(int i) {
        if (i >= this.e) {
            return i + this.f;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(int i) {
        if (i >= 0) {
            bk8 bk8Var = this.u;
            if (bk8Var == null) {
                bk8Var = new bk8(null, 1, null);
                this.u = bk8Var;
            }
            bk8Var.a(i);
        }
    }

    private final void c1(int i, bk8 bk8Var) {
        int a0 = a0(i);
        boolean E = E(i);
        if (yna.c(this.b, a0) != E) {
            yna.u(this.b, a0, E);
            int z0 = z0(i);
            if (z0 >= 0) {
                bk8Var.a(z0);
            }
        }
    }

    private final void d1(int[] iArr, int i, int i2) {
        yna.v(iArr, i, N(i2, this.j, this.k, this.c.length));
    }

    private final void g1(int i, Object obj) {
        boolean z;
        int a0 = a0(i);
        int[] iArr = this.b;
        if (a0 < iArr.length && yna.l(iArr, a0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.c[M(y0(this.b, a0))] = obj;
            return;
        }
        tn1.w(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.r;
            r0(i3);
            int i4 = this.e;
            int i5 = this.f;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i8 = max - i6;
                xr.f(iArr, iArr2, 0, 0, i4 * 5);
                xr.f(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                this.b = iArr2;
                i5 = i8;
            }
            int i9 = this.g;
            if (i9 >= i4) {
                this.g = i9 + i;
            }
            int i10 = i4 + i;
            this.e = i10;
            this.f = i5 - i;
            if (i6 > 0) {
                i2 = K(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.l >= i4) {
                i7 = this.j;
            }
            int N = N(i2, i7, this.k, this.c.length);
            for (int i11 = i4; i11 < i10; i11++) {
                yna.v(this.b, i11, N);
            }
            int i12 = this.l;
            if (i12 >= i4) {
                this.l = i12 + i;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(int i, int i2) {
        if (i > 0) {
            t0(this.h, i2);
            int i3 = this.j;
            int i4 = this.k;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                xr.h(objArr, objArr2, 0, 0, i3);
                xr.h(objArr, objArr2, i3 + i7, i8, length);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.i;
            if (i9 >= i3) {
                this.i = i9 + i;
            }
            this.j = i3 + i;
            this.k = i4 - i;
        }
    }

    public static /* synthetic */ void n0(zna znaVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = znaVar.s;
        }
        znaVar.m0(i);
    }

    private final void o0(int i, int i2, int i3) {
        int i4 = i3 + i;
        int X = X();
        int n = yna.n(this.d, i, X);
        ArrayList arrayList = new ArrayList();
        if (n >= 0) {
            while (n < this.d.size()) {
                rd rdVar = this.d.get(n);
                z65.g(rdVar, "anchors[index]");
                rd rdVar2 = rdVar;
                int B = B(rdVar2);
                if (B < i || B >= i4) {
                    break;
                }
                arrayList.add(rdVar2);
                this.d.remove(n);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            rd rdVar3 = (rd) arrayList.get(i6);
            int B2 = B(rdVar3) + i5;
            if (B2 >= this.e) {
                rdVar3.c(-(X - B2));
            } else {
                rdVar3.c(B2);
            }
            this.d.add(yna.n(this.d, B2, X), rdVar3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(int i) {
        int i2 = this.f;
        int i3 = this.e;
        if (i3 != i) {
            boolean z = true;
            if (!this.d.isEmpty()) {
                Z0(i3, i);
            }
            if (i2 > 0) {
                int[] iArr = this.b;
                int i4 = i * 5;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                if (i < i3) {
                    xr.f(iArr, iArr, i5 + i4, i4, i6);
                } else {
                    xr.f(iArr, iArr, i6, i6 + i5, i4 + i5);
                }
            }
            if (i < i3) {
                i3 = i + i2;
            }
            int T = T();
            if (i3 >= T) {
                z = false;
            }
            tn1.T(z);
            while (i3 < T) {
                int r = yna.r(this.b, i3);
                int C0 = C0(B0(r), i);
                if (C0 != r) {
                    yna.z(this.b, i3, C0);
                }
                i3++;
                if (i3 == i) {
                    i3 += i2;
                }
            }
        }
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = this.k;
        int i4 = this.j;
        int i5 = this.l;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                xr.h(objArr, objArr, i + i3, i, i4);
            } else {
                xr.h(objArr, objArr, i4, i4 + i3, i + i3);
            }
        }
        int min = Math.min(i2 + 1, X());
        if (i5 != min) {
            int length = this.c.length - i3;
            if (min < i5) {
                int a0 = a0(min);
                int a02 = a0(i5);
                int i6 = this.e;
                while (a0 < a02) {
                    int e = yna.e(this.b, a0);
                    if (e >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        yna.v(this.b, a0, -((length - e) + 1));
                        a0++;
                        if (a0 == i6) {
                            a0 += this.f;
                        }
                    } else {
                        tn1.w("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int a03 = a0(i5);
                int a04 = a0(min);
                while (a03 < a04) {
                    int e2 = yna.e(this.b, a03);
                    if (e2 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        yna.v(this.b, a03, e2 + length + 1);
                        a03++;
                        if (a03 == this.e) {
                            a03 += this.f;
                        }
                    } else {
                        tn1.w("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.l = min;
        }
        this.j = i;
    }

    private final int y0(int[] iArr, int i) {
        return L(iArr, i);
    }

    public final rd A(int i) {
        ArrayList<rd> arrayList = this.d;
        int s = yna.s(arrayList, i, X());
        if (s < 0) {
            if (i > this.e) {
                i = -(X() - i);
            }
            rd rdVar = new rd(i);
            arrayList.add(-(s + 1), rdVar);
            return rdVar;
        }
        rd rdVar2 = arrayList.get(s);
        z65.g(rdVar2, "get(location)");
        return rdVar2;
    }

    public final int B(rd rdVar) {
        z65.h(rdVar, "anchor");
        int a2 = rdVar.a();
        if (a2 < 0) {
            return a2 + X();
        }
        return a2;
    }

    public final void D() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            K0();
        }
    }

    public final boolean F0() {
        boolean z;
        if (this.m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.r;
            int i2 = this.h;
            int O0 = O0();
            bk8 bk8Var = this.u;
            if (bk8Var != null) {
                while (bk8Var.b() && bk8Var.c() >= i) {
                    bk8Var.d();
                }
            }
            boolean G0 = G0(i, this.r - i);
            H0(i2, this.h - i2, i - 1);
            this.r = i;
            this.h = i2;
            this.n -= O0;
            return G0;
        }
        tn1.w("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final void G() {
        this.t = true;
        if (this.o.d()) {
            r0(X());
            t0(this.c.length - this.k, this.e);
            F();
            D0();
        }
        this.a.k(this, this.b, this.e, this.c, this.j, this.d);
    }

    public final void I0() {
        boolean z;
        if (this.m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            D0();
            this.r = 0;
            this.g = T() - this.f;
            this.h = 0;
            this.i = 0;
            this.n = 0;
            return;
        }
        tn1.w("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final Object L0(int i, Object obj) {
        int S0 = S0(this.b, a0(this.r));
        boolean z = true;
        int i2 = S0 + i;
        if ((i2 < S0 || i2 >= L(this.b, a0(this.r + 1))) ? false : false) {
            int M = M(i2);
            Object[] objArr = this.c;
            Object obj2 = objArr[M];
            objArr[M] = obj;
            return obj2;
        }
        tn1.w(("Write to an invalid slot index " + i + " for group " + this.r).toString());
        throw new KotlinNothingValueException();
    }

    public final void M0(Object obj) {
        boolean z;
        int i = this.h;
        if (i <= this.i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.c[M(i - 1)] = obj;
        } else {
            tn1.w("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Object N0() {
        if (this.m > 0) {
            j0(1, this.s);
        }
        Object[] objArr = this.c;
        int i = this.h;
        this.h = i + 1;
        return objArr[M(i)];
    }

    public final int O() {
        boolean z;
        int i;
        int i2 = 1;
        int i3 = 0;
        if (this.m > 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.r;
        int i5 = this.g;
        int i6 = this.s;
        int a0 = a0(i6);
        int i7 = this.n;
        int i8 = i4 - i6;
        boolean l = yna.l(this.b, a0);
        if (z) {
            yna.w(this.b, a0, i8);
            yna.y(this.b, a0, i7);
            int h = this.q.h();
            if (!l) {
                i2 = i7;
            }
            this.n = h + i2;
            this.s = A0(this.b, i6);
        } else {
            if (i4 != i5) {
                i2 = 0;
            }
            if (i2 != 0) {
                int g = yna.g(this.b, a0);
                int o = yna.o(this.b, a0);
                yna.w(this.b, a0, i8);
                yna.y(this.b, a0, i7);
                int h2 = this.o.h();
                J0();
                this.s = h2;
                int A0 = A0(this.b, i6);
                int h3 = this.q.h();
                this.n = h3;
                if (A0 == h2) {
                    if (!l) {
                        i3 = i7 - o;
                    }
                    this.n = h3 + i3;
                } else {
                    int i9 = i8 - g;
                    if (l) {
                        i = 0;
                    } else {
                        i = i7 - o;
                    }
                    if (i9 != 0 || i != 0) {
                        while (A0 != 0 && A0 != h2 && (i != 0 || i9 != 0)) {
                            int a02 = a0(A0);
                            if (i9 != 0) {
                                yna.w(this.b, a02, yna.g(this.b, a02) + i9);
                            }
                            if (i != 0) {
                                int[] iArr = this.b;
                                yna.y(iArr, a02, yna.o(iArr, a02) + i);
                            }
                            if (yna.l(this.b, a02)) {
                                i = 0;
                            }
                            A0 = A0(this.b, A0);
                        }
                    }
                    this.n += i;
                }
            } else {
                tn1.w("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
        }
        return i7;
    }

    public final int O0() {
        int a0 = a0(this.r);
        int g = this.r + yna.g(this.b, a0);
        this.r = g;
        this.h = L(this.b, a0(g));
        if (yna.l(this.b, a0)) {
            return 1;
        }
        return yna.o(this.b, a0);
    }

    public final void P() {
        boolean z;
        int i = this.m;
        if (i > 0) {
            int i2 = i - 1;
            this.m = i2;
            if (i2 == 0) {
                if (this.q.b() == this.o.b()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    J0();
                    return;
                } else {
                    tn1.w("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void P0() {
        int i = this.g;
        this.r = i;
        this.h = L(this.b, a0(i));
    }

    public final void Q(int i) {
        boolean z;
        boolean z2 = false;
        if (this.m <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.s;
            if (i2 != i) {
                if (i >= i2 && i < this.g) {
                    z2 = true;
                }
                if (z2) {
                    int i3 = this.r;
                    int i4 = this.h;
                    int i5 = this.i;
                    this.r = i;
                    U0();
                    this.r = i3;
                    this.h = i4;
                    this.i = i5;
                    return;
                }
                tn1.w(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw new KotlinNothingValueException();
            }
            return;
        }
        tn1.w("Cannot call ensureStarted() while inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final Object Q0(int i, int i2) {
        int S0 = S0(this.b, a0(i));
        int L = L(this.b, a0(i + 1));
        int i3 = i2 + S0;
        if (S0 <= i3 && i3 < L) {
            return this.c[M(i3)];
        }
        return qn1.a.a();
    }

    public final void R(rd rdVar) {
        z65.h(rdVar, "anchor");
        Q(rdVar.e(this));
    }

    public final Object R0(rd rdVar, int i) {
        z65.h(rdVar, "anchor");
        return Q0(B(rdVar), i);
    }

    public final void T0(int i, Object obj, Object obj2) {
        W0(i, obj, false, obj2);
    }

    public final boolean U() {
        return this.t;
    }

    public final void U0() {
        boolean z;
        if (this.m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            qn1.a aVar = qn1.a;
            W0(0, aVar.a(), false, aVar.a());
            return;
        }
        tn1.w("Key must be supplied when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final int V() {
        return this.r;
    }

    public final void V0(int i, Object obj) {
        W0(i, obj, false, qn1.a.a());
    }

    public final int W() {
        return this.s;
    }

    public final int X() {
        return T() - this.f;
    }

    public final void X0(int i, Object obj) {
        W0(i, obj, true, qn1.a.a());
    }

    public final wna Y() {
        return this.a;
    }

    public final Object Y0(Object obj) {
        Object N0 = N0();
        M0(obj);
        return N0;
    }

    public final Object Z(int i) {
        int a0 = a0(i);
        if (yna.h(this.b, a0)) {
            return this.c[C(this.b, a0)];
        }
        return qn1.a.a();
    }

    public final void a1(Object obj) {
        int a0 = a0(this.r);
        if (yna.h(this.b, a0)) {
            this.c[M(C(this.b, a0))] = obj;
        } else {
            tn1.w("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final int b0(int i) {
        return yna.m(this.b, a0(i));
    }

    public final Object c0(int i) {
        int a0 = a0(i);
        if (yna.j(this.b, a0)) {
            return this.c[yna.q(this.b, a0)];
        }
        return null;
    }

    public final int d0(int i) {
        return yna.g(this.b, a0(i));
    }

    public final Iterator<Object> e0() {
        int L = L(this.b, a0(this.r));
        int[] iArr = this.b;
        int i = this.r;
        return new b(L, L(iArr, a0(i + d0(i))), this);
    }

    public final void e1(rd rdVar, Object obj) {
        z65.h(rdVar, "anchor");
        g1(rdVar.e(this), obj);
    }

    public final boolean f0(int i) {
        return g0(i, this.r);
    }

    public final void f1(Object obj) {
        g1(this.r, obj);
    }

    public final boolean g0(int i, int i2) {
        int T;
        int d0;
        if (i2 == this.s) {
            T = this.g;
        } else {
            if (i2 > this.o.g(0)) {
                d0 = d0(i2);
            } else {
                int c = this.o.c(i2);
                if (c < 0) {
                    d0 = d0(i2);
                } else {
                    T = (T() - this.f) - this.p.f(c);
                }
            }
            T = d0 + i2;
        }
        if (i <= i2 || i >= T) {
            return false;
        }
        return true;
    }

    public final boolean h0(int i) {
        int i2 = this.s;
        if ((i > i2 && i < this.g) || (i2 == 0 && i == 0)) {
            return true;
        }
        return false;
    }

    public final boolean k0() {
        int i = this.r;
        if (i < this.g && yna.l(this.b, a0(i))) {
            return true;
        }
        return false;
    }

    public final boolean l0(int i) {
        return yna.l(this.b, a0(i));
    }

    public final void m0(int i) {
        int a0 = a0(i);
        if (!yna.i(this.b, a0)) {
            yna.x(this.b, a0, true);
            if (!yna.c(this.b, a0)) {
                b1(z0(i));
            }
        }
    }

    public final List<rd> p0(wna wnaVar, int i, boolean z) {
        boolean z2;
        z65.h(wnaVar, "table");
        if (this.m > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tn1.T(z2);
        if (i == 0 && this.r == 0 && this.a.v() == 0 && yna.g(wnaVar.u(), i) == wnaVar.v()) {
            int[] iArr = this.b;
            Object[] objArr = this.c;
            ArrayList<rd> arrayList = this.d;
            int[] u = wnaVar.u();
            int v2 = wnaVar.v();
            Object[] x = wnaVar.x();
            int z3 = wnaVar.z();
            this.b = u;
            this.c = x;
            this.d = wnaVar.t();
            this.e = v2;
            this.f = (u.length / 5) - v2;
            this.j = z3;
            this.k = x.length - z3;
            this.l = v2;
            wnaVar.G(iArr, 0, objArr, 0, arrayList);
            return this.d;
        }
        zna E = wnaVar.E();
        try {
            return v.b(E, i, this, true, true, z);
        } finally {
            E.G();
        }
    }

    public final void q0(int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        if (this.m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i == 0) {
                    return;
                }
                int i3 = this.r;
                int i4 = this.s;
                int i5 = this.g;
                int i6 = i3;
                for (int i7 = i; i7 > 0; i7--) {
                    i6 += yna.g(this.b, a0(i6));
                    if (i6 <= i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        tn1.w("Parameter offset is out of bounds".toString());
                        throw new KotlinNothingValueException();
                    }
                }
                int g = yna.g(this.b, a0(i6));
                int i8 = this.h;
                int L = L(this.b, a0(i6));
                int i9 = i6 + g;
                int L2 = L(this.b, a0(i9));
                int i10 = L2 - L;
                j0(i10, Math.max(this.r - 1, 0));
                i0(g);
                int[] iArr = this.b;
                int a0 = a0(i9) * 5;
                xr.f(iArr, iArr, a0(i3) * 5, a0, (g * 5) + a0);
                if (i10 > 0) {
                    Object[] objArr = this.c;
                    xr.h(objArr, objArr, i8, M(L + i10), M(L2 + i10));
                }
                int i11 = L + i10;
                int i12 = i11 - i8;
                int i13 = this.j;
                int i14 = this.k;
                int length = this.c.length;
                int i15 = this.l;
                int i16 = i3 + g;
                int i17 = i3;
                while (i17 < i16) {
                    int a02 = a0(i17);
                    int i18 = i13;
                    int L3 = L(iArr, a02) - i12;
                    int i19 = i12;
                    if (i15 < a02) {
                        i2 = 0;
                    } else {
                        i2 = i18;
                    }
                    d1(iArr, a02, N(L3, i2, i14, length));
                    i17++;
                    i13 = i18;
                    i12 = i19;
                }
                o0(i9, i3, g);
                if (!G0(i9, g)) {
                    S(i4, this.g, i3);
                    if (i10 > 0) {
                        H0(i11, i10, i9 - 1);
                        return;
                    }
                    return;
                }
                tn1.w("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
            tn1.w("Parameter offset is out of bounds".toString());
            throw new KotlinNothingValueException();
        }
        tn1.w("Cannot move a group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (d0(r12.r + r13) == 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<defpackage.rd> s0(int r13, defpackage.wna r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "table"
            defpackage.z65.h(r14, r0)
            int r0 = r12.m
            if (r0 > 0) goto L14
            int r0 = r12.r
            int r0 = r0 + r13
            int r0 = r12.d0(r0)
            r1 = 1
            if (r0 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            defpackage.tn1.T(r1)
            int r0 = r12.r
            int r1 = r12.h
            int r2 = r12.i
            r12.z(r13)
            r12.U0()
            r12.D()
            zna r13 = r14.E()
            zna$a r3 = defpackage.zna.v     // Catch: java.lang.Throwable -> L4a
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 32
            r11 = 0
            r4 = r13
            r5 = r15
            r6 = r12
            java.util.List r14 = defpackage.zna.a.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L4a
            r13.G()
            r12.P()
            r12.O()
            r12.r = r0
            r12.h = r1
            r12.i = r2
            return r14
        L4a:
            r14 = move-exception
            r13.G()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zna.s0(int, wna, int):java.util.List");
    }

    public String toString() {
        return "SlotWriter(current = " + this.r + " end=" + this.g + " size = " + X() + " gap=" + this.e + CoreConstants.DASH_CHAR + (this.e + this.f) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final List<rd> u0(rd rdVar, int i, zna znaVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int x0;
        boolean z4;
        z65.h(rdVar, "anchor");
        z65.h(znaVar, "writer");
        boolean z5 = true;
        if (znaVar.m > 0) {
            z = true;
        } else {
            z = false;
        }
        tn1.T(z);
        if (this.m == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tn1.T(z2);
        tn1.T(rdVar.b());
        int B = B(rdVar) + i;
        int i2 = this.r;
        if (i2 <= B && B < this.g) {
            z3 = true;
        } else {
            z3 = false;
        }
        tn1.T(z3);
        int z0 = z0(B);
        int d0 = d0(B);
        if (l0(B)) {
            x0 = 1;
        } else {
            x0 = x0(B);
        }
        List<rd> c = a.c(v, this, B, znaVar, false, false, false, 32, null);
        b1(z0);
        if (x0 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        while (z0 >= i2) {
            int a0 = a0(z0);
            int[] iArr = this.b;
            yna.w(iArr, a0, yna.g(iArr, a0) - d0);
            if (z4) {
                if (yna.l(this.b, a0)) {
                    z4 = false;
                } else {
                    int[] iArr2 = this.b;
                    yna.y(iArr2, a0, yna.o(iArr2, a0) - x0);
                }
            }
            z0 = z0(z0);
        }
        if (z4) {
            if (this.n < x0) {
                z5 = false;
            }
            tn1.T(z5);
            this.n -= x0;
        }
        return c;
    }

    public final Object v0(int i) {
        int a0 = a0(i);
        if (yna.l(this.b, a0)) {
            return this.c[M(y0(this.b, a0))];
        }
        return null;
    }

    public final Object w0(rd rdVar) {
        z65.h(rdVar, "anchor");
        return v0(rdVar.e(this));
    }

    public final int x0(int i) {
        return yna.o(this.b, a0(i));
    }

    public final void z(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.m <= 0) {
                if (i == 0) {
                    return;
                }
                int i2 = this.r + i;
                if (i2 >= this.s && i2 <= this.g) {
                    z2 = true;
                }
                if (z2) {
                    this.r = i2;
                    int L = L(this.b, a0(i2));
                    this.h = L;
                    this.i = L;
                    return;
                }
                tn1.w(("Cannot seek outside the current group (" + this.s + CoreConstants.DASH_CHAR + this.g + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
                throw new KotlinNothingValueException();
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        tn1.w("Cannot seek backwards".toString());
        throw new KotlinNothingValueException();
    }

    public final int z0(int i) {
        return A0(this.b, i);
    }
}
