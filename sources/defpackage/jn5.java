package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.en5;
import defpackage.gb8;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: LayoutNodeLayoutDelegate.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\bf\u0010gJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u0006\u0010\u0010\u001a\u00020\u0007J\u000f\u0010\u0011\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\fJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0007J\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\u0007R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010'\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0016\u0010)\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!R$\u0010,\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R$\u0010/\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010#R\u0016\u00101\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010!R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u0004R\u0016\u00106\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u0004R*\u0010<\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010!\u001a\u0004\b9\u0010#\"\u0004\b:\u0010;R*\u0010@\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010!\u001a\u0004\b>\u0010#\"\u0004\b?\u0010;R*\u0010F\u001a\u0002022\u0006\u00107\u001a\u0002028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010L\u001a\u00060GR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR0\u0010R\u001a\b\u0018\u00010MR\u00020\u00002\f\u0010\u001a\u001a\b\u0018\u00010MR\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0011\u0010V\u001a\u00020S8F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001c\u0010Y\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001c\u0010[\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bZ\u0010XR\u0014\u0010]\u001a\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010CR\u0014\u0010_\u001a\u0002028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010CR\u0014\u0010c\u001a\u00020`8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0016\u0010e\u001a\u0004\u0018\u00010`8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bd\u0010b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006h"}, d2 = {"Ljn5;", "", "Len5;", "", "I", "Lnr1;", "constraints", "", "Q", "(J)V", "P", "K", "()V", "N", "L", "M", "O", "p", "V", "H", "R", "J", "a", "Len5;", "layoutNode", "Len5$e;", "<set-?>", "b", "Len5$e;", "y", "()Len5$e;", "layoutState", com.huawei.hms.opendevice.c.a, "Z", "E", "()Z", "measurePending", DateTokenConverter.CONVERTER_KEY, "x", "layoutPending", e.a, "layoutPendingForAlignment", "f", "B", "lookaheadMeasurePending", "g", "A", "lookaheadLayoutPending", Image.TYPE_HIGH, "lookaheadLayoutPendingForAlignment", "", "i", "nextChildLookaheadPlaceOrder", "j", "nextChildPlaceOrder", "value", "k", "t", "U", "(Z)V", "coordinatesAccessedDuringPlacement", "l", Image.TYPE_SMALL, "T", "coordinatesAccessedDuringModifierPlacement", Image.TYPE_MEDIUM, "r", "()I", "S", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "Ljn5$b;", "n", "Ljn5$b;", "D", "()Ljn5$b;", "measurePassDelegate", "Ljn5$a;", "o", "Ljn5$a;", "C", "()Ljn5$a;", "lookaheadPassDelegate", "Loz6;", "F", "()Loz6;", "outerCoordinator", "v", "()Lnr1;", "lastConstraints", "w", "lastLookaheadConstraints", "u", "height", "G", "width", "Lkb;", "q", "()Lkb;", "alignmentLinesOwner", "z", "lookaheadAlignmentLinesOwner", "<init>", "(Len5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jn5  reason: default package */
/* loaded from: classes.dex */
public final class jn5 {
    private final en5 a;
    private en5.e b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private final b n;
    private a o;

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0006\u0010\u0017\u001a\u00020\u0004J\u001d\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010%\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u000e\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u001cJ\u0006\u0010)\u001a\u00020\u0004J\u0006\u0010*\u001a\u00020\u001cJ\u000f\u0010+\u001a\u00020\u0004H\u0000¢\u0006\u0004\b+\u0010,J\u0006\u0010-\u001a\u00020\u0004J\u0006\u0010.\u001a\u00020\u0004R\u0016\u00101\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00105\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010;\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00104\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010I\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u00100\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00100R\u0016\u0010M\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00100R!\u0010P\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bN\u0010OR-\u0010U\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u001f8\u0000@BX\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR$\u0010Z\u001a\u00020!2\u0006\u00102\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR@\u0010_\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00122\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\"\u0010c\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u00100\u001a\u0004\ba\u0010F\"\u0004\bb\u0010HR\u001a\u0010i\u001a\u00020d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001e\u0010n\u001a\f\u0012\b\u0012\u00060\u0000R\u00020k0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\"\u0010r\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u00100\u001a\u0004\bp\u0010F\"\u0004\bq\u0010HR$\u0010t\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\bs\u0010FR\u0016\u0010v\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u00100R(\u0010{\u001a\u0004\u0018\u00010w2\b\u00102\u001a\u0004\u0018\u00010w8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\be\u0010zR\u0018\u0010\u007f\u001a\u00060|R\u00020k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u001f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00188Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\"\u0010\u008a\u0001\u001a\r\u0012\b\u0012\u00060\u0000R\u00020k0\u0087\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bN\u0010\u008b\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u008f\u0001"}, d2 = {"Ljn5$a;", "Lgb8;", "Lmb6;", "Lkb;", "", "I0", "S0", "Len5;", "node", "d1", "J0", "R0", "U0", "u", "", "Lhb;", "", e.a, "Lkotlin/Function1;", "block", "G", "requestLayout", "L", "T0", "Lnr1;", "constraints", "E", "(J)Lgb8;", "", "X0", "(J)Z", "Ls55;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/c;", "layerBlock", "D0", "(JFLkotlin/jvm/functions/Function1;)V", "forceRequest", "P0", "Q0", "e1", "W0", "()V", "Y0", "V0", "f", "Z", "relayoutWithoutParentInProgress", "<set-?>", "g", "I", "previousPlaceOrder", Image.TYPE_HIGH, "getPlaceOrder$ui_release", "()I", "b1", "(I)V", "placeOrder", "Len5$g;", "i", "Len5$g;", "O0", "()Len5$g;", "a1", "(Len5$g;)V", "measuredByParent", "j", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "duringAlignmentLinesQuery", "k", "placedOnce", "l", "measuredOnce", Image.TYPE_MEDIUM, "Lnr1;", "lookaheadConstraints", "n", "J", "getLastPosition-nOcc-ac$ui_release", "()J", "lastPosition", "o", "F", "getLastZIndex$ui_release", "()F", "lastZIndex", "p", "Lkotlin/jvm/functions/Function1;", "getLastLayerBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "q", "b", "c1", "isPlaced", "Ljb;", "r", "Ljb;", DateTokenConverter.CONVERTER_KEY, "()Ljb;", "alignmentLines", "Lgr6;", "Ljn5;", Image.TYPE_SMALL, "Lgr6;", "_childDelegates", "t", "getChildDelegatesDirty$ui_release", "Z0", "childDelegatesDirty", "M0", "layingOutChildren", "v", "parentDataDirty", "", "w", "Ljava/lang/Object;", "()Ljava/lang/Object;", "parentData", "Ljn5$b;", "N0", "()Ljn5$b;", "measurePassDelegate", "L0", "()Lnr1;", "lastConstraints", "Loz6;", "D", "()Loz6;", "innerCoordinator", "", "K0", "()Ljava/util/List;", "childDelegates", "()Lkb;", "parentAlignmentLinesOwner", "<init>", "(Ljn5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jn5$a */
    /* loaded from: classes.dex */
    public final class a extends gb8 implements mb6, kb {
        private boolean f;
        private boolean j;
        private boolean k;
        private boolean l;
        private nr1 m;
        private float o;
        private Function1<? super androidx.compose.ui.graphics.c, Unit> p;
        private boolean q;
        private boolean u;
        private int g = Integer.MAX_VALUE;
        private int h = Integer.MAX_VALUE;
        private en5.g i = en5.g.NotUsed;
        private long n = s55.b.a();
        private final jb r = new ry5(this);
        private final gr6<a> s = new gr6<>(new a[16], 0);
        private boolean t = true;
        private boolean v = true;
        private Object w = N0().r();

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: jn5$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0399a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[en5.e.values().length];
                try {
                    iArr[en5.e.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[en5.e.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[en5.e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[en5.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[en5.g.values().length];
                try {
                    iArr2[en5.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[en5.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: jn5$a$b */
        /* loaded from: classes.dex */
        public static final class b extends ej5 implements Function0<Unit> {
            final /* synthetic */ ty5 b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkb;", "child", "", "a", "(Lkb;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: jn5$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0400a extends ej5 implements Function1<kb, Unit> {
                public static final C0400a a = new C0400a();

                C0400a() {
                    super(1);
                }

                public final void a(kb kbVar) {
                    z65.h(kbVar, "child");
                    kbVar.d().t(false);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(kb kbVar) {
                    a(kbVar);
                    return Unit.a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkb;", "child", "", "a", "(Lkb;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: jn5$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0401b extends ej5 implements Function1<kb, Unit> {
                public static final C0401b a = new C0401b();

                C0401b() {
                    super(1);
                }

                public final void a(kb kbVar) {
                    z65.h(kbVar, "child");
                    kbVar.d().q(kbVar.d().l());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(kb kbVar) {
                    a(kbVar);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ty5 ty5Var) {
                super(0);
                this.b = ty5Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.this.J0();
                a.this.G(C0400a.a);
                this.b.M0().a();
                a.this.I0();
                a.this.G(C0401b.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: jn5$a$c */
        /* loaded from: classes.dex */
        public static final class c extends ej5 implements Function0<Unit> {
            final /* synthetic */ jn5 a;
            final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(jn5 jn5Var, long j) {
                super(0);
                this.a = jn5Var;
                this.b = j;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                gb8.a.C0324a c0324a = gb8.a.a;
                jn5 jn5Var = this.a;
                long j = this.b;
                ty5 v1 = jn5Var.F().v1();
                z65.e(v1);
                gb8.a.p(c0324a, v1, j, 0.0f, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkb;", "it", "", "a", "(Lkb;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: jn5$a$d */
        /* loaded from: classes.dex */
        public static final class d extends ej5 implements Function1<kb, Unit> {
            public static final d a = new d();

            d() {
                super(1);
            }

            public final void a(kb kbVar) {
                z65.h(kbVar, "it");
                kbVar.d().u(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(kb kbVar) {
                a(kbVar);
                return Unit.a;
            }
        }

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I0() {
            gr6<en5> o0 = jn5.this.a.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                int i = 0;
                do {
                    a C = r[i].O().C();
                    z65.e(C);
                    int i2 = C.g;
                    int i3 = C.h;
                    if (i2 != i3 && i3 == Integer.MAX_VALUE) {
                        C.S0();
                    }
                    i++;
                } while (i < s);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J0() {
            int i = 0;
            jn5.this.i = 0;
            gr6<en5> o0 = jn5.this.a.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                do {
                    a C = r[i].O().C();
                    z65.e(C);
                    C.g = C.h;
                    C.h = Integer.MAX_VALUE;
                    if (C.i == en5.g.InLayoutBlock) {
                        C.i = en5.g.NotUsed;
                    }
                    i++;
                } while (i < s);
            }
        }

        private final void R0() {
            boolean b2 = b();
            c1(true);
            int i = 0;
            if (!b2 && jn5.this.B()) {
                en5.a1(jn5.this.a, true, false, 2, null);
            }
            gr6<en5> o0 = jn5.this.a.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                do {
                    en5 en5Var = r[i];
                    if (en5Var.i0() != Integer.MAX_VALUE) {
                        a T = en5Var.T();
                        z65.e(T);
                        T.R0();
                        en5Var.f1(en5Var);
                    }
                    i++;
                } while (i < s);
            }
        }

        private final void S0() {
            if (b()) {
                int i = 0;
                c1(false);
                gr6<en5> o0 = jn5.this.a.o0();
                int s = o0.s();
                if (s > 0) {
                    en5[] r = o0.r();
                    do {
                        a C = r[i].O().C();
                        z65.e(C);
                        C.S0();
                        i++;
                    } while (i < s);
                }
            }
        }

        private final void U0() {
            en5 en5Var = jn5.this.a;
            jn5 jn5Var = jn5.this;
            gr6<en5> o0 = en5Var.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                int i = 0;
                do {
                    en5 en5Var2 = r[i];
                    if (en5Var2.S() && en5Var2.a0() == en5.g.InMeasureBlock) {
                        a C = en5Var2.O().C();
                        z65.e(C);
                        nr1 L0 = L0();
                        z65.e(L0);
                        if (C.X0(L0.s())) {
                            en5.a1(jn5Var.a, false, false, 3, null);
                        }
                    }
                    i++;
                } while (i < s);
            }
        }

        private final void d1(en5 en5Var) {
            en5.g gVar;
            en5 h0 = en5Var.h0();
            if (h0 != null) {
                if (this.i != en5.g.NotUsed && !en5Var.B()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = C0399a.$EnumSwitchMapping$0[h0.Q().ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3 && i != 4) {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + h0.Q());
                    }
                    gVar = en5.g.InLayoutBlock;
                } else {
                    gVar = en5.g.InMeasureBlock;
                }
                this.i = gVar;
                return;
            }
            this.i = en5.g.NotUsed;
        }

        @Override // defpackage.kb
        public oz6 D() {
            return jn5.this.a.L();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.gb8
        public void D0(long j, float f, Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
            jn5.this.b = en5.e.LookaheadLayingOut;
            this.k = true;
            if (!s55.g(j, this.n)) {
                if (jn5.this.s() || jn5.this.t()) {
                    jn5.this.g = true;
                }
                T0();
            }
            um7 b2 = in5.b(jn5.this.a);
            if (!jn5.this.A() && b()) {
                W0();
            } else {
                jn5.this.T(false);
                d().r(false);
                wm7.c(b2.getSnapshotObserver(), jn5.this.a, false, new c(jn5.this, j), 2, null);
            }
            this.n = j;
            this.o = f;
            this.p = function1;
            jn5.this.b = en5.e.Idle;
        }

        @Override // defpackage.mb6
        public gb8 E(long j) {
            d1(jn5.this.a);
            if (jn5.this.a.N() == en5.g.NotUsed) {
                jn5.this.a.t();
            }
            X0(j);
            return this;
        }

        @Override // defpackage.kb
        public void G(Function1<? super kb, Unit> function1) {
            z65.h(function1, "block");
            gr6<en5> o0 = jn5.this.a.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                int i = 0;
                do {
                    kb z = r[i].O().z();
                    z65.e(z);
                    function1.invoke(z);
                    i++;
                } while (i < s);
            }
        }

        public final List<a> K0() {
            jn5.this.a.E();
            if (this.t) {
                en5 en5Var = jn5.this.a;
                gr6<a> gr6Var = this.s;
                gr6<en5> o0 = en5Var.o0();
                int s = o0.s();
                if (s > 0) {
                    en5[] r = o0.r();
                    int i = 0;
                    do {
                        en5 en5Var2 = r[i];
                        if (gr6Var.s() <= i) {
                            a C = en5Var2.O().C();
                            z65.e(C);
                            gr6Var.b(C);
                        } else {
                            a C2 = en5Var2.O().C();
                            z65.e(C2);
                            gr6Var.C(i, C2);
                        }
                        i++;
                    } while (i < s);
                    gr6Var.A(en5Var.E().size(), gr6Var.s());
                    this.t = false;
                    return this.s.h();
                }
                gr6Var.A(en5Var.E().size(), gr6Var.s());
                this.t = false;
                return this.s.h();
            }
            return this.s.h();
        }

        @Override // defpackage.kb
        public void L() {
            en5.a1(jn5.this.a, false, false, 3, null);
        }

        public final nr1 L0() {
            return this.m;
        }

        public final boolean M0() {
            return this.u;
        }

        public final b N0() {
            return jn5.this.D();
        }

        public final en5.g O0() {
            return this.i;
        }

        public final void P0(boolean z) {
            en5 h0;
            en5 h02 = jn5.this.a.h0();
            en5.g N = jn5.this.a.N();
            if (h02 != null && N != en5.g.NotUsed) {
                while (h02.N() == N && (h0 = h02.h0()) != null) {
                    h02 = h0;
                }
                int i = C0399a.$EnumSwitchMapping$1[N.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (h02.U() != null) {
                            h02.X0(z);
                            return;
                        } else {
                            h02.b1(z);
                            return;
                        }
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                } else if (h02.U() != null) {
                    en5.a1(h02, z, false, 2, null);
                } else {
                    en5.e1(h02, z, false, 2, null);
                }
            }
        }

        public final void Q0() {
            this.v = true;
        }

        public final void T0() {
            gr6<en5> o0;
            int s;
            if (jn5.this.r() > 0 && (s = (o0 = jn5.this.a.o0()).s()) > 0) {
                en5[] r = o0.r();
                int i = 0;
                do {
                    en5 en5Var = r[i];
                    jn5 O = en5Var.O();
                    if ((O.t() || O.s()) && !O.x()) {
                        en5.Y0(en5Var, false, 1, null);
                    }
                    a C = O.C();
                    if (C != null) {
                        C.T0();
                    }
                    i++;
                } while (i < s);
            }
        }

        public final void V0() {
            this.h = Integer.MAX_VALUE;
            this.g = Integer.MAX_VALUE;
            c1(false);
        }

        public final void W0() {
            en5 h0 = jn5.this.a.h0();
            if (!b()) {
                R0();
            }
            if (h0 != null) {
                if (!this.f && (h0.Q() == en5.e.LayingOut || h0.Q() == en5.e.LookaheadLayingOut)) {
                    if (this.h == Integer.MAX_VALUE) {
                        this.h = h0.O().i;
                        h0.O().i++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.h = 0;
            }
            u();
        }

        public final boolean X0(long j) {
            boolean z;
            nr1 nr1Var;
            en5 h0 = jn5.this.a.h0();
            en5 en5Var = jn5.this.a;
            if (!jn5.this.a.B() && (h0 == null || !h0.B())) {
                z = false;
            } else {
                z = true;
            }
            en5Var.i1(z);
            if (!jn5.this.a.S() && (nr1Var = this.m) != null && nr1.g(nr1Var.s(), j)) {
                um7 g0 = jn5.this.a.g0();
                if (g0 != null) {
                    g0.g(jn5.this.a, true);
                }
                jn5.this.a.h1();
                return false;
            }
            this.m = nr1.b(j);
            d().s(false);
            G(d.a);
            this.l = true;
            ty5 v1 = jn5.this.F().v1();
            if (v1 != null) {
                long a = x55.a(v1.y0(), v1.e0());
                jn5.this.P(j);
                E0(x55.a(v1.y0(), v1.e0()));
                if (w55.g(a) != v1.y0() || w55.f(a) != v1.e0()) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }

        public final void Y0() {
            try {
                this.f = true;
                if (this.k) {
                    D0(this.n, 0.0f, null);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            } finally {
                this.f = false;
            }
        }

        public final void Z0(boolean z) {
            this.t = z;
        }

        public final void a1(en5.g gVar) {
            z65.h(gVar, "<set-?>");
            this.i = gVar;
        }

        @Override // defpackage.kb
        public boolean b() {
            return this.q;
        }

        public final void b1(int i) {
            this.h = i;
        }

        public void c1(boolean z) {
            this.q = z;
        }

        @Override // defpackage.kb
        public jb d() {
            return this.r;
        }

        @Override // defpackage.kb
        public Map<hb, Integer> e() {
            if (!this.j) {
                if (jn5.this.y() == en5.e.LookaheadMeasuring) {
                    d().s(true);
                    if (d().g()) {
                        jn5.this.L();
                    }
                } else {
                    d().r(true);
                }
            }
            ty5 v1 = D().v1();
            if (v1 != null) {
                v1.T0(true);
            }
            u();
            ty5 v12 = D().v1();
            if (v12 != null) {
                v12.T0(false);
            }
            return d().h();
        }

        public final boolean e1() {
            if (r() == null) {
                ty5 v1 = jn5.this.F().v1();
                z65.e(v1);
                if (v1.r() == null) {
                    return false;
                }
            }
            if (!this.v) {
                return false;
            }
            this.v = false;
            ty5 v12 = jn5.this.F().v1();
            z65.e(v12);
            this.w = v12.r();
            return true;
        }

        @Override // defpackage.kb
        public kb m() {
            jn5 O;
            en5 h0 = jn5.this.a.h0();
            if (h0 != null && (O = h0.O()) != null) {
                return O.z();
            }
            return null;
        }

        @Override // defpackage.x65
        public Object r() {
            return this.w;
        }

        @Override // defpackage.kb
        public void requestLayout() {
            en5.Y0(jn5.this.a, false, 1, null);
        }

        @Override // defpackage.kb
        public void u() {
            this.u = true;
            d().o();
            if (jn5.this.A()) {
                U0();
            }
            ty5 v1 = D().v1();
            z65.e(v1);
            if (jn5.this.h || (!this.j && !v1.Q0() && jn5.this.A())) {
                jn5.this.g = false;
                en5.e y = jn5.this.y();
                jn5.this.b = en5.e.LookaheadLayingOut;
                um7 b2 = in5.b(jn5.this.a);
                jn5.this.U(false);
                wm7.e(b2.getSnapshotObserver(), jn5.this.a, false, new b(v1), 2, null);
                jn5.this.b = y;
                if (jn5.this.t() && v1.Q0()) {
                    requestLayout();
                }
                jn5.this.h = false;
            }
            if (d().l()) {
                d().q(true);
            }
            if (d().g() && d().k()) {
                d().n();
            }
            this.u = false;
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ;\u0010 \u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0014J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u001dJ\u0014\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$H\u0016J\u001c\u0010)\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0010H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\u0006\u0010,\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u001dJ\u0006\u0010/\u001a\u00020\u0004R\u0016\u00102\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u00108\u001a\u00020&2\u0006\u00103\u001a\u00020&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010;\u001a\u00020&2\u0006\u00103\u001a\u00020&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u0016\u0010=\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00101R\u0016\u0010?\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00101R\"\u0010G\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010M\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u00101\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001f\u0010P\u001a\u00020\f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00101R(\u0010^\u001a\u0004\u0018\u00010Y2\b\u00103\u001a\u0004\u0018\u00010Y8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R*\u0010a\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001d8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u00101\u001a\u0004\b_\u0010J\"\u0004\b`\u0010LR\u001a\u0010g\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001e\u0010l\u001a\f\u0012\b\u0012\u00060\u0000R\u00020i0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010o\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u00101\u001a\u0004\bm\u0010J\"\u0004\bn\u0010LR$\u0010r\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bp\u00101\u001a\u0004\bq\u0010JR$\u0010\u000f\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bs\u0010U\u001a\u0004\bt\u0010uR\u001c\u0010x\u001a\u0004\u0018\u00010\u00198Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u001f\u0010\u0080\u0001\u001a\f\u0012\b\u0012\u00060\u0000R\u00020i0}8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0016\u0010\u0082\u0001\u001a\u00020&8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u00107R\u0018\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bN\u0010\u0083\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Ljn5$b;", "Lmb6;", "Lgb8;", "Lkb;", "", "I0", "T0", "S0", "J0", "Len5;", "node", "e1", "Ls55;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "Y0", "(JFLkotlin/jvm/functions/Function1;)V", "V0", "u", "X0", "()V", "Lnr1;", "constraints", "E", "(J)Lgb8;", "", "Z0", "(J)Z", "D0", "a1", "R0", "f1", "", "Lhb;", "", e.a, "block", "G", "requestLayout", "L", "U0", "forceRequest", "Q0", "W0", "f", "Z", "relayoutWithoutParentInProgress", "<set-?>", "g", "I", "getPreviousPlaceOrder$ui_release", "()I", "previousPlaceOrder", Image.TYPE_HIGH, "O0", "placeOrder", "i", "measuredOnce", "j", "placedOnce", "Len5$g;", "k", "Len5$g;", "N0", "()Len5$g;", "c1", "(Len5$g;)V", "measuredByParent", "l", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "duringAlignmentLinesQuery", Image.TYPE_MEDIUM, "J", "lastPosition", "n", "Lkotlin/jvm/functions/Function1;", "lastLayerBlock", "o", "F", "lastZIndex", "p", "parentDataDirty", "", "q", "Ljava/lang/Object;", "r", "()Ljava/lang/Object;", "parentData", "b", "d1", "isPlaced", "Ljb;", Image.TYPE_SMALL, "Ljb;", DateTokenConverter.CONVERTER_KEY, "()Ljb;", "alignmentLines", "Lgr6;", "Ljn5;", "t", "Lgr6;", "_childDelegates", "getChildDelegatesDirty$ui_release", "b1", "childDelegatesDirty", "v", "M0", "layingOutChildren", "w", "P0", "()F", "L0", "()Lnr1;", "lastConstraints", "Loz6;", "D", "()Loz6;", "innerCoordinator", "", "K0", "()Ljava/util/List;", "childDelegates", "v0", "measuredWidth", "()Lkb;", "parentAlignmentLinesOwner", "<init>", "(Ljn5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jn5$b */
    /* loaded from: classes.dex */
    public final class b extends gb8 implements mb6, kb {
        private boolean f;
        private boolean i;
        private boolean j;
        private boolean l;
        private Function1<? super androidx.compose.ui.graphics.c, Unit> n;
        private float o;
        private Object q;
        private boolean r;
        private boolean v;
        private float w;
        private int g = Integer.MAX_VALUE;
        private int h = Integer.MAX_VALUE;
        private en5.g k = en5.g.NotUsed;
        private long m = s55.b.a();
        private boolean p = true;
        private final jb s = new fn5(this);
        private final gr6<b> t = new gr6<>(new b[16], 0);
        private boolean u = true;

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: jn5$b$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[en5.e.values().length];
                try {
                    iArr[en5.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[en5.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[en5.g.values().length];
                try {
                    iArr2[en5.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[en5.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: jn5$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0402b extends ej5 implements Function0<Unit> {
            final /* synthetic */ en5 b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkb;", "it", "", "a", "(Lkb;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: jn5$b$b$a */
            /* loaded from: classes.dex */
            public static final class a extends ej5 implements Function1<kb, Unit> {
                public static final a a = new a();

                a() {
                    super(1);
                }

                public final void a(kb kbVar) {
                    z65.h(kbVar, "it");
                    kbVar.d().t(false);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(kb kbVar) {
                    a(kbVar);
                    return Unit.a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkb;", "it", "", "a", "(Lkb;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: jn5$b$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0403b extends ej5 implements Function1<kb, Unit> {
                public static final C0403b a = new C0403b();

                C0403b() {
                    super(1);
                }

                public final void a(kb kbVar) {
                    z65.h(kbVar, "it");
                    kbVar.d().q(kbVar.d().l());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(kb kbVar) {
                    a(kbVar);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0402b(en5 en5Var) {
                super(0);
                this.b = en5Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.this.J0();
                b.this.G(a.a);
                this.b.L().M0().a();
                b.this.I0();
                b.this.G(C0403b.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: jn5$b$c */
        /* loaded from: classes.dex */
        public static final class c extends ej5 implements Function0<Unit> {
            final /* synthetic */ Function1<androidx.compose.ui.graphics.c, Unit> a;
            final /* synthetic */ jn5 b;
            final /* synthetic */ long c;
            final /* synthetic */ float d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(Function1<? super androidx.compose.ui.graphics.c, Unit> function1, jn5 jn5Var, long j, float f) {
                super(0);
                this.a = function1;
                this.b = jn5Var;
                this.c = j;
                this.d = f;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                gb8.a.C0324a c0324a = gb8.a.a;
                Function1<androidx.compose.ui.graphics.c, Unit> function1 = this.a;
                jn5 jn5Var = this.b;
                long j = this.c;
                float f = this.d;
                if (function1 == null) {
                    c0324a.o(jn5Var.F(), j, f);
                } else {
                    c0324a.w(jn5Var.F(), j, f, function1);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkb;", "it", "", "a", "(Lkb;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: jn5$b$d */
        /* loaded from: classes.dex */
        public static final class d extends ej5 implements Function1<kb, Unit> {
            public static final d a = new d();

            d() {
                super(1);
            }

            public final void a(kb kbVar) {
                z65.h(kbVar, "it");
                kbVar.d().u(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(kb kbVar) {
                a(kbVar);
                return Unit.a;
            }
        }

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I0() {
            en5 en5Var = jn5.this.a;
            gr6<en5> o0 = en5Var.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                int i = 0;
                do {
                    en5 en5Var2 = r[i];
                    if (en5Var2.W().g != en5Var2.i0()) {
                        en5Var.P0();
                        en5Var.w0();
                        if (en5Var2.i0() == Integer.MAX_VALUE) {
                            en5Var2.W().T0();
                        }
                    }
                    i++;
                } while (i < s);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J0() {
            int i = 0;
            jn5.this.j = 0;
            gr6<en5> o0 = jn5.this.a.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                do {
                    b W = r[i].W();
                    W.g = W.h;
                    W.h = Integer.MAX_VALUE;
                    if (W.k == en5.g.InLayoutBlock) {
                        W.k = en5.g.NotUsed;
                    }
                    i++;
                } while (i < s);
            }
        }

        private final void S0() {
            boolean b = b();
            d1(true);
            en5 en5Var = jn5.this.a;
            int i = 0;
            if (!b) {
                if (en5Var.X()) {
                    en5.e1(en5Var, true, false, 2, null);
                } else if (en5Var.S()) {
                    en5.a1(en5Var, true, false, 2, null);
                }
            }
            oz6 A1 = en5Var.L().A1();
            for (oz6 f0 = en5Var.f0(); !z65.c(f0, A1) && f0 != null; f0 = f0.A1()) {
                if (f0.s1()) {
                    f0.K1();
                }
            }
            gr6<en5> o0 = en5Var.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                do {
                    en5 en5Var2 = r[i];
                    if (en5Var2.i0() != Integer.MAX_VALUE) {
                        en5Var2.W().S0();
                        en5Var.f1(en5Var2);
                    }
                    i++;
                } while (i < s);
            }
        }

        private final void T0() {
            if (b()) {
                int i = 0;
                d1(false);
                gr6<en5> o0 = jn5.this.a.o0();
                int s = o0.s();
                if (s > 0) {
                    en5[] r = o0.r();
                    do {
                        r[i].W().T0();
                        i++;
                    } while (i < s);
                }
            }
        }

        private final void V0() {
            en5 en5Var = jn5.this.a;
            jn5 jn5Var = jn5.this;
            gr6<en5> o0 = en5Var.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                int i = 0;
                do {
                    en5 en5Var2 = r[i];
                    if (en5Var2.X() && en5Var2.Z() == en5.g.InMeasureBlock && en5.T0(en5Var2, null, 1, null)) {
                        en5.e1(jn5Var.a, false, false, 3, null);
                    }
                    i++;
                } while (i < s);
            }
        }

        private final void Y0(long j, float f, Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
            jn5.this.b = en5.e.LayingOut;
            this.m = j;
            this.o = f;
            this.n = function1;
            this.j = true;
            um7 b = in5.b(jn5.this.a);
            if (!jn5.this.x() && b()) {
                jn5.this.F().Y1(j, f, function1);
                X0();
            } else {
                d().r(false);
                jn5.this.T(false);
                b.getSnapshotObserver().b(jn5.this.a, false, new c(function1, jn5.this, j, f));
            }
            jn5.this.b = en5.e.Idle;
        }

        private final void e1(en5 en5Var) {
            en5.g gVar;
            en5 h0 = en5Var.h0();
            if (h0 != null) {
                if (this.k != en5.g.NotUsed && !en5Var.B()) {
                    throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
                }
                int i = a.$EnumSwitchMapping$0[h0.Q().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        gVar = en5.g.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + h0.Q());
                    }
                } else {
                    gVar = en5.g.InMeasureBlock;
                }
                this.k = gVar;
                return;
            }
            this.k = en5.g.NotUsed;
        }

        @Override // defpackage.kb
        public oz6 D() {
            return jn5.this.a.L();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.gb8
        public void D0(long j, float f, Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
            if (!s55.g(j, this.m)) {
                if (jn5.this.s() || jn5.this.t()) {
                    jn5.this.d = true;
                }
                U0();
            }
            jn5 jn5Var = jn5.this;
            if (jn5Var.I(jn5Var.a)) {
                gb8.a.C0324a c0324a = gb8.a.a;
                jn5 jn5Var2 = jn5.this;
                a C = jn5Var2.C();
                z65.e(C);
                en5 h0 = jn5Var2.a.h0();
                if (h0 != null) {
                    h0.O().i = 0;
                }
                C.b1(Integer.MAX_VALUE);
                gb8.a.n(c0324a, C, s55.h(j), s55.i(j), 0.0f, 4, null);
            }
            Y0(j, f, function1);
        }

        @Override // defpackage.mb6
        public gb8 E(long j) {
            en5.g N = jn5.this.a.N();
            en5.g gVar = en5.g.NotUsed;
            if (N == gVar) {
                jn5.this.a.t();
            }
            jn5 jn5Var = jn5.this;
            if (jn5Var.I(jn5Var.a)) {
                this.i = true;
                F0(j);
                a C = jn5.this.C();
                z65.e(C);
                C.a1(gVar);
                C.E(j);
            }
            e1(jn5.this.a);
            Z0(j);
            return this;
        }

        @Override // defpackage.kb
        public void G(Function1<? super kb, Unit> function1) {
            z65.h(function1, "block");
            gr6<en5> o0 = jn5.this.a.o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                int i = 0;
                do {
                    function1.invoke(r[i].O().q());
                    i++;
                } while (i < s);
            }
        }

        public final List<b> K0() {
            jn5.this.a.n1();
            if (this.u) {
                en5 en5Var = jn5.this.a;
                gr6<b> gr6Var = this.t;
                gr6<en5> o0 = en5Var.o0();
                int s = o0.s();
                if (s > 0) {
                    en5[] r = o0.r();
                    int i = 0;
                    do {
                        en5 en5Var2 = r[i];
                        if (gr6Var.s() <= i) {
                            gr6Var.b(en5Var2.O().D());
                        } else {
                            gr6Var.C(i, en5Var2.O().D());
                        }
                        i++;
                    } while (i < s);
                    gr6Var.A(en5Var.E().size(), gr6Var.s());
                    this.u = false;
                    return this.t.h();
                }
                gr6Var.A(en5Var.E().size(), gr6Var.s());
                this.u = false;
                return this.t.h();
            }
            return this.t.h();
        }

        @Override // defpackage.kb
        public void L() {
            en5.e1(jn5.this.a, false, false, 3, null);
        }

        public final nr1 L0() {
            if (this.i) {
                return nr1.b(x0());
            }
            return null;
        }

        public final boolean M0() {
            return this.v;
        }

        public final en5.g N0() {
            return this.k;
        }

        public final int O0() {
            return this.h;
        }

        public final float P0() {
            return this.w;
        }

        public final void Q0(boolean z) {
            en5 h0;
            en5 h02 = jn5.this.a.h0();
            en5.g N = jn5.this.a.N();
            if (h02 != null && N != en5.g.NotUsed) {
                while (h02.N() == N && (h0 = h02.h0()) != null) {
                    h02 = h0;
                }
                int i = a.$EnumSwitchMapping$1[N.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        h02.b1(z);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                en5.e1(h02, z, false, 2, null);
            }
        }

        public final void R0() {
            this.p = true;
        }

        public final void U0() {
            gr6<en5> o0;
            int s;
            if (jn5.this.r() > 0 && (s = (o0 = jn5.this.a.o0()).s()) > 0) {
                en5[] r = o0.r();
                int i = 0;
                do {
                    en5 en5Var = r[i];
                    jn5 O = en5Var.O();
                    if ((O.t() || O.s()) && !O.x()) {
                        en5.c1(en5Var, false, 1, null);
                    }
                    O.D().U0();
                    i++;
                } while (i < s);
            }
        }

        public final void W0() {
            this.h = Integer.MAX_VALUE;
            this.g = Integer.MAX_VALUE;
            d1(false);
        }

        public final void X0() {
            en5 h0 = jn5.this.a.h0();
            float C1 = D().C1();
            en5 en5Var = jn5.this.a;
            oz6 f0 = en5Var.f0();
            oz6 L = en5Var.L();
            while (f0 != L) {
                z65.f(f0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                an5 an5Var = (an5) f0;
                C1 += an5Var.C1();
                f0 = an5Var.A1();
            }
            if (C1 != this.w) {
                this.w = C1;
                if (h0 != null) {
                    h0.P0();
                }
                if (h0 != null) {
                    h0.w0();
                }
            }
            if (!b()) {
                if (h0 != null) {
                    h0.w0();
                }
                S0();
            }
            if (h0 != null) {
                if (!this.f && h0.Q() == en5.e.LayingOut) {
                    if (this.h == Integer.MAX_VALUE) {
                        this.h = h0.O().j;
                        h0.O().j++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.h = 0;
            }
            u();
        }

        public final boolean Z0(long j) {
            boolean z;
            um7 b = in5.b(jn5.this.a);
            en5 h0 = jn5.this.a.h0();
            en5 en5Var = jn5.this.a;
            boolean z2 = true;
            if (!jn5.this.a.B() && (h0 == null || !h0.B())) {
                z = false;
            } else {
                z = true;
            }
            en5Var.i1(z);
            if (!jn5.this.a.X() && nr1.g(x0(), j)) {
                tm7.a(b, jn5.this.a, false, 2, null);
                jn5.this.a.h1();
                return false;
            }
            d().s(false);
            G(d.a);
            this.i = true;
            long a2 = jn5.this.F().a();
            F0(j);
            jn5.this.Q(j);
            if (w55.e(jn5.this.F().a(), a2) && jn5.this.F().y0() == y0() && jn5.this.F().e0() == e0()) {
                z2 = false;
            }
            E0(x55.a(jn5.this.F().y0(), jn5.this.F().e0()));
            return z2;
        }

        public final void a1() {
            try {
                this.f = true;
                if (this.j) {
                    Y0(this.m, this.o, this.n);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            } finally {
                this.f = false;
            }
        }

        @Override // defpackage.kb
        public boolean b() {
            return this.r;
        }

        public final void b1(boolean z) {
            this.u = z;
        }

        public final void c1(en5.g gVar) {
            z65.h(gVar, "<set-?>");
            this.k = gVar;
        }

        @Override // defpackage.kb
        public jb d() {
            return this.s;
        }

        public void d1(boolean z) {
            this.r = z;
        }

        @Override // defpackage.kb
        public Map<hb, Integer> e() {
            if (!this.l) {
                if (jn5.this.y() == en5.e.Measuring) {
                    d().s(true);
                    if (d().g()) {
                        jn5.this.K();
                    }
                } else {
                    d().r(true);
                }
            }
            D().T0(true);
            u();
            D().T0(false);
            return d().h();
        }

        public final boolean f1() {
            if ((r() == null && jn5.this.F().r() == null) || !this.p) {
                return false;
            }
            this.p = false;
            this.q = jn5.this.F().r();
            return true;
        }

        @Override // defpackage.kb
        public kb m() {
            jn5 O;
            en5 h0 = jn5.this.a.h0();
            if (h0 != null && (O = h0.O()) != null) {
                return O.q();
            }
            return null;
        }

        @Override // defpackage.x65
        public Object r() {
            return this.q;
        }

        @Override // defpackage.kb
        public void requestLayout() {
            en5.c1(jn5.this.a, false, 1, null);
        }

        @Override // defpackage.kb
        public void u() {
            this.v = true;
            d().o();
            if (jn5.this.x()) {
                V0();
            }
            if (jn5.this.e || (!this.l && !D().Q0() && jn5.this.x())) {
                jn5.this.d = false;
                en5.e y = jn5.this.y();
                jn5.this.b = en5.e.LayingOut;
                jn5.this.U(false);
                en5 en5Var = jn5.this.a;
                in5.b(en5Var).getSnapshotObserver().d(en5Var, false, new C0402b(en5Var));
                jn5.this.b = y;
                if (D().Q0() && jn5.this.t()) {
                    requestLayout();
                }
                jn5.this.e = false;
            }
            if (d().l()) {
                d().q(true);
            }
            if (d().g() && d().k()) {
                d().n();
            }
            this.v = false;
        }

        @Override // defpackage.gb8
        public int v0() {
            return jn5.this.F().v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: jn5$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ty5 v1 = jn5.this.F().v1();
            z65.e(v1);
            v1.E(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: jn5$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j) {
            super(0);
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            jn5.this.F().E(this.b);
        }
    }

    public jn5(en5 en5Var) {
        z65.h(en5Var, "layoutNode");
        this.a = en5Var;
        this.b = en5.e.Idle;
        this.n = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I(en5 en5Var) {
        en5 en5Var2;
        if (en5Var.U() != null) {
            en5 h0 = en5Var.h0();
            if (h0 != null) {
                en5Var2 = h0.U();
            } else {
                en5Var2 = null;
            }
            if (en5Var2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(long j) {
        this.b = en5.e.LookaheadMeasuring;
        this.f = false;
        wm7.g(in5.b(this.a).getSnapshotObserver(), this.a, false, new c(j), 2, null);
        L();
        if (I(this.a)) {
            K();
        } else {
            N();
        }
        this.b = en5.e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(long j) {
        en5.e eVar = this.b;
        en5.e eVar2 = en5.e.Idle;
        if (eVar == eVar2) {
            en5.e eVar3 = en5.e.Measuring;
            this.b = eVar3;
            this.c = false;
            in5.b(this.a).getSnapshotObserver().f(this.a, false, new d(j));
            if (this.b == eVar3) {
                K();
                this.b = eVar2;
                return;
            }
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts".toString());
    }

    public final boolean A() {
        return this.g;
    }

    public final boolean B() {
        return this.f;
    }

    public final a C() {
        return this.o;
    }

    public final b D() {
        return this.n;
    }

    public final boolean E() {
        return this.c;
    }

    public final oz6 F() {
        return this.a.e0().n();
    }

    public final int G() {
        return this.n.y0();
    }

    public final void H() {
        this.n.R0();
        a aVar = this.o;
        if (aVar != null) {
            aVar.Q0();
        }
    }

    public final void J() {
        this.n.b1(true);
        a aVar = this.o;
        if (aVar != null) {
            aVar.Z0(true);
        }
    }

    public final void K() {
        this.d = true;
        this.e = true;
    }

    public final void L() {
        this.g = true;
        this.h = true;
    }

    public final void M() {
        this.f = true;
    }

    public final void N() {
        this.c = true;
    }

    public final void O() {
        en5.e Q = this.a.Q();
        if (Q == en5.e.LayingOut || Q == en5.e.LookaheadLayingOut) {
            if (this.n.M0()) {
                U(true);
            } else {
                T(true);
            }
        }
        if (Q == en5.e.LookaheadLayingOut) {
            a aVar = this.o;
            if (aVar != null && aVar.M0()) {
                U(true);
            } else {
                T(true);
            }
        }
    }

    public final void R() {
        jb d2;
        this.n.d().p();
        a aVar = this.o;
        if (aVar != null && (d2 = aVar.d()) != null) {
            d2.p();
        }
    }

    public final void S(int i) {
        boolean z;
        jn5 jn5Var;
        int i2 = this.m;
        this.m = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            en5 h0 = this.a.h0();
            if (h0 != null) {
                jn5Var = h0.O();
            } else {
                jn5Var = null;
            }
            if (jn5Var != null) {
                if (i == 0) {
                    jn5Var.S(jn5Var.m - 1);
                } else {
                    jn5Var.S(jn5Var.m + 1);
                }
            }
        }
    }

    public final void T(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z && !this.k) {
                S(this.m + 1);
            } else if (!z && !this.k) {
                S(this.m - 1);
            }
        }
    }

    public final void U(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.l) {
                S(this.m + 1);
            } else if (!z && !this.l) {
                S(this.m - 1);
            }
        }
    }

    public final void V() {
        en5 h0;
        if (this.n.f1() && (h0 = this.a.h0()) != null) {
            en5.e1(h0, false, false, 3, null);
        }
        a aVar = this.o;
        if (aVar != null && aVar.e1()) {
            if (I(this.a)) {
                en5 h02 = this.a.h0();
                if (h02 != null) {
                    en5.e1(h02, false, false, 3, null);
                    return;
                }
                return;
            }
            en5 h03 = this.a.h0();
            if (h03 != null) {
                en5.a1(h03, false, false, 3, null);
            }
        }
    }

    public final void p() {
        if (this.o == null) {
            this.o = new a();
        }
    }

    public final kb q() {
        return this.n;
    }

    public final int r() {
        return this.m;
    }

    public final boolean s() {
        return this.l;
    }

    public final boolean t() {
        return this.k;
    }

    public final int u() {
        return this.n.e0();
    }

    public final nr1 v() {
        return this.n.L0();
    }

    public final nr1 w() {
        a aVar = this.o;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public final boolean x() {
        return this.d;
    }

    public final en5.e y() {
        return this.b;
    }

    public final kb z() {
        return this.o;
    }
}
