package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import im.threads.business.transport.MessageAttributes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000 ø\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004ù\u0001ú\u0001B\u0011\u0012\u0006\u0010u\u001a\u00020p¢\u0006\u0006\bö\u0001\u0010÷\u0001J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J!\u0010\u000e\u001a\u00020\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u0012\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\bH\u0002JC\u0010$\u001a\u00020\u0007*\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%JK\u0010'\u001a\u00020\u0007*\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(JK\u0010)\u001a\u00020\u0007*\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010(J\f\u0010*\u001a\u00020\u0000*\u00020\u0003H\u0002J%\u0010-\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u001eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J \u00102\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\bH\u0002J\u0018\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020/2\u0006\u00101\u001a\u00020\bH\u0002J\u001d\u00105\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J!\u00107\u001a\u0004\u0018\u00010\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u0006\u00109\u001a\u00020\bJ\u000f\u0010:\u001a\u00020\u0007H\u0010¢\u0006\u0004\b:\u0010;J\b\u0010<\u001a\u00020\u0007H&J\u0018\u0010@\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=H\u0014J\u000f\u0010A\u001a\u00020\u0007H\u0000¢\u0006\u0004\bA\u0010;J\u0006\u0010B\u001a\u00020\u0007J;\u0010C\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010\u0017J9\u0010D\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010\u0017J\u000e\u0010E\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0006J\u0010\u0010F\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\u0006\u0010G\u001a\u00020\u0007J\u0011\u0010H\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0006H\u0096\u0002J&\u0010J\u001a\u00020\u00072\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010I\u001a\u00020\bJ;\u0010K\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ=\u0010M\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010LJ\u0006\u0010O\u001a\u00020NJ\u001d\u0010Q\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u00106J%\u0010T\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ\u0018\u0010V\u001a\u00020N2\u0006\u0010R\u001a\u00020\u00032\u0006\u00101\u001a\u00020\bH\u0016J\u001d\u0010W\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u00106J\u001d\u0010X\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u00106J\u001d\u0010Y\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bY\u00106J\u0018\u0010\\\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010[\u001a\u00020ZH\u0004J\u0006\u0010]\u001a\u00020\u0007J\u0006\u0010^\u001a\u00020\u0007J)\u0010`\u001a\u00020\u00072\u0006\u00103\u001a\u00020/2\u0006\u00101\u001a\u00020\b2\b\b\u0002\u0010_\u001a\u00020\bH\u0000¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010cJ\u001d\u0010d\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bd\u0010cJ\b\u0010e\u001a\u00020\u0007H\u0016J\b\u0010f\u001a\u00020\u0007H\u0016J\u0017\u0010h\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u0000H\u0000¢\u0006\u0004\bh\u0010iJ\u0006\u0010j\u001a\u00020\bJ\u001d\u0010m\u001a\u00020k2\u0006\u0010l\u001a\u00020kH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u00106J%\u0010n\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010l\u001a\u00020kH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bn\u0010oR\u001a\u0010u\u001a\u00020p8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR$\u0010|\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R%\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b}\u0010w\u001a\u0004\b~\u0010y\"\u0004\b\u007f\u0010{R\u0019\u0010\u0083\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0082\u0001RE\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0015\u0010\u0086\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R)\u0010\u009e\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0004\u0012\u00020=\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R:\u0010\u0011\u001a\u00020\u00102\u0007\u0010\u0086\u0001\u001a\u00020\u00108\u0016@TX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R1\u0010\u0013\u001a\u00020\u00122\u0007\u0010\u0086\u0001\u001a\u00020\u00128\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010\u0094\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001b\u0010¯\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010®\u0001R\u001e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R)\u0010¶\u0001\u001a\u00020\b2\u0007\u0010\u0086\u0001\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\bV\u0010\u0082\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R0\u0010¼\u0001\u001a\u0005\u0018\u00010·\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010·\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u0018\u0010À\u0001\u001a\u00030½\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0017\u0010Ã\u0001\u001a\u00020\n8&X¦\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Æ\u0001\u001a\u00030\u008f\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0017\u0010È\u0001\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010§\u0001R\u0017\u0010Ê\u0001\u001a\u00020\u00128VX\u0096\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010§\u0001R\u0019\u0010Í\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0017\u0010Ð\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001e\u0010Ó\u0001\u001a\u00030Ñ\u00018Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\bÒ\u0001\u0010¢\u0001R\u0018\u0010×\u0001\u001a\u00030Ô\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0019\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ì\u0001R\u0017\u0010Û\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010µ\u0001R\u0017\u0010Ü\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010µ\u0001R,\u0010â\u0001\u001a\u00030\u0096\u00012\b\u0010Ý\u0001\u001a\u00030\u0096\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R0\u0010è\u0001\u001a\u0005\u0018\u00010ã\u00012\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010ã\u00018&@dX¦\u000e¢\u0006\u0010\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R\u001a\u0010ë\u0001\u001a\u0005\u0018\u00010é\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010ê\u0001R\u0016\u0010ì\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010Ï\u0001R\u0017\u0010ï\u0001\u001a\u00020/8DX\u0084\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010î\u0001R!\u0010ò\u0001\u001a\u00030ð\u00018@X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\bñ\u0001\u0010¢\u0001R\u0017\u0010ô\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010µ\u0001R\u001c\u0010l\u001a\u00020k8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\bõ\u0001\u0010¢\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006û\u0001"}, d2 = {"Loz6;", "Lsy5;", "Lmb6;", "Lom5;", "Lvm7;", "Lkotlin/Function1;", "Lqn0;", "", "", "includeTail", "Lsm6$c;", "F1", "Lqz6;", MessageAttributes.TYPE, "D1", "(I)Z", "Ls55;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/c;", "layerBlock", "X1", "(JFLkotlin/jvm/functions/Function1;)V", "canvas", "m1", "invokeOnLayoutChange", "m2", "Loz6$f;", "hitTestSource", "Ls67;", "pointerPosition", "Lqo4;", "hitTestResult", "isTouchEvent", "isInLayer", "G1", "(Lsm6$c;Loz6$f;JLqo4;ZZ)V", "distanceFromEdge", "H1", "(Lsm6$c;Loz6$f;JLqo4;ZZF)V", "g2", "h2", "ancestor", "offset", "h1", "(Loz6;J)J", "Lzq6;", "rect", "clipBounds", "g1", "bounds", "q1", "O1", "(J)J", "E1", "(I)Lsm6$c;", "N1", "S0", "()V", "n1", "", "width", "height", "S1", "P1", "T1", "D0", "Y1", "k1", "W1", "U1", "L1", "forceUpdateLayerParameters", "k2", "I1", "(Loz6$f;JLqo4;ZZ)V", "J1", "Lk99;", "j2", "relativeToLocal", "B", "sourceCoordinates", "relativeToSource", "v", "(Lom5;J)J", "x", "I", "i2", "p1", "Lpp7;", "paint", "l1", "R1", "V1", "clipToMinimumTouchTargetSize", "Z1", "(Lzq6;ZZ)V", "o2", "(J)Z", "M1", "K1", "Q1", "other", "o1", "(Loz6;)Loz6;", "f2", "Lcna;", "minimumTouchTargetSize", "i1", "j1", "(JJ)F", "Len5;", Image.TYPE_HIGH, "Len5;", "L0", "()Len5;", "layoutNode", "i", "Loz6;", "A1", "()Loz6;", "d2", "(Loz6;)V", "wrapped", "j", "B1", "e2", "wrappedBy", "k", "Z", "released", "l", "isClipping", "<set-?>", Image.TYPE_MEDIUM, "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "La03;", "n", "La03;", "layerDensity", "Lqm5;", "o", "Lqm5;", "layerLayoutDirection", "p", "F", "lastLayerAlpha", "Ltb6;", "q", "Ltb6;", "_measureResult", "", "Lhb;", "r", "Ljava/util/Map;", "oldAlignmentLines", Image.TYPE_SMALL, "J", "O0", "()J", "c2", "(J)V", "t", "C1", "()F", "setZIndex", "(F)V", "u", "Lzq6;", "_rectCache", "Lim5;", "Lim5;", "layerPositionalProperties", "Lkotlin/Function0;", "w", "Lkotlin/jvm/functions/Function0;", "invalidateParentLayer", "s1", "()Z", "lastLayerDrawingWasSkipped", "Lsm7;", "y", "Lsm7;", "u1", "()Lsm7;", "layer", "Lwm7;", "y1", "()Lwm7;", "snapshotObserver", "z1", "()Lsm6$c;", "tail", "getLayoutDirection", "()Lqm5;", "layoutDirection", "getDensity", "density", "k0", "fontScale", "N0", "()Lsy5;", "parent", "J0", "()Lom5;", MessageAttributes.COORDINATES, "Lw55;", "a", "size", "Lkb;", "r1", "()Lkb;", "alignmentLinesOwner", "I0", "child", "K0", "hasMeasureResult", "isAttached", "value", "M0", "()Ltb6;", "b2", "(Ltb6;)V", "measureResult", "Lty5;", "v1", "()Lty5;", "setLookaheadDelegate", "(Lty5;)V", "lookaheadDelegate", "", "()Ljava/lang/Object;", "parentData", "parentLayoutCoordinates", "x1", "()Lzq6;", "rectCache", "Lnr1;", "t1", "lastMeasurementConstraints", "b0", "isValidOwnerScope", "w1", "<init>", "(Len5;)V", "z", com.huawei.hms.push.e.a, "f", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: oz6  reason: default package */
/* loaded from: classes.dex */
public abstract class oz6 extends sy5 implements mb6, om5, vm7, Function1<qn0, Unit> {
    private final en5 h;
    private oz6 i;
    private oz6 j;
    private boolean k;
    private boolean l;
    private Function1<? super androidx.compose.ui.graphics.c, Unit> m;
    private a03 n;
    private qm5 o;
    private float p;
    private tb6 q;
    private Map<hb, Integer> r;
    private long s;
    private float t;
    private zq6 u;
    private im5 v;
    private final Function0<Unit> w;
    private boolean x;
    private sm7 y;
    public static final e z = new e(null);
    private static final Function1<oz6, Unit> A = d.a;
    private static final Function1<oz6, Unit> B = c.a;
    private static final androidx.compose.ui.graphics.d I = new androidx.compose.ui.graphics.d();
    private static final im5 X = new im5();
    private static final float[] Y = oa6.c(null, 1, null);
    private static final f Z = new a();
    private static final f S4 = new b();

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"oz6$a", "Loz6$f;", "Lqz6;", "Lfe8;", "b", "()I", "Lsm6$c;", "node", "", "a", "Len5;", "parentLayoutNode", DateTokenConverter.CONVERTER_KEY, "layoutNode", "Ls67;", "pointerPosition", "Lqo4;", "hitTestResult", "isTouchEvent", "isInLayer", "", com.huawei.hms.opendevice.c.a, "(Len5;JLqo4;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: oz6$a */
    /* loaded from: classes.dex */
    public static final class a implements f {
        a() {
        }

        @Override // defpackage.oz6.f
        public boolean a(sm6.c cVar) {
            z65.h(cVar, "node");
            int a = qz6.a(16);
            gr6 gr6Var = null;
            while (cVar != null) {
                if (cVar instanceof fe8) {
                    if (((fe8) cVar).B()) {
                        return true;
                    }
                } else if ((cVar.H0() & a) != 0 && (cVar instanceof fu2)) {
                    int i = 0;
                    for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                        if ((g1.H0() & a) != 0) {
                            i++;
                            if (i == 1) {
                                cVar = g1;
                            } else {
                                if (gr6Var == null) {
                                    gr6Var = new gr6(new sm6.c[16], 0);
                                }
                                if (cVar != null) {
                                    gr6Var.b(cVar);
                                    cVar = null;
                                }
                                gr6Var.b(g1);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                cVar = au2.g(gr6Var);
            }
            return false;
        }

        @Override // defpackage.oz6.f
        public int b() {
            return qz6.a(16);
        }

        @Override // defpackage.oz6.f
        public void c(en5 en5Var, long j, qo4 qo4Var, boolean z, boolean z2) {
            z65.h(en5Var, "layoutNode");
            z65.h(qo4Var, "hitTestResult");
            en5Var.p0(j, qo4Var, z, z2);
        }

        @Override // defpackage.oz6.f
        public boolean d(en5 en5Var) {
            z65.h(en5Var, "parentLayoutNode");
            return true;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J=\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"oz6$b", "Loz6$f;", "Lqz6;", "Lyaa;", "b", "()I", "Lsm6$c;", "node", "", "a", "Len5;", "parentLayoutNode", DateTokenConverter.CONVERTER_KEY, "layoutNode", "Ls67;", "pointerPosition", "Lqo4;", "hitTestResult", "isTouchEvent", "isInLayer", "", com.huawei.hms.opendevice.c.a, "(Len5;JLqo4;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: oz6$b */
    /* loaded from: classes.dex */
    public static final class b implements f {
        b() {
        }

        @Override // defpackage.oz6.f
        public boolean a(sm6.c cVar) {
            z65.h(cVar, "node");
            return false;
        }

        @Override // defpackage.oz6.f
        public int b() {
            return qz6.a(8);
        }

        @Override // defpackage.oz6.f
        public void c(en5 en5Var, long j, qo4 qo4Var, boolean z, boolean z2) {
            z65.h(en5Var, "layoutNode");
            z65.h(qo4Var, "hitTestResult");
            en5Var.r0(j, qo4Var, z, z2);
        }

        @Override // defpackage.oz6.f
        public boolean d(en5 en5Var) {
            z65.h(en5Var, "parentLayoutNode");
            taa F = en5Var.F();
            boolean z = false;
            if (F != null && F.v()) {
                z = true;
            }
            return !z;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loz6;", "coordinator", "", "a", "(Loz6;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: oz6$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<oz6, Unit> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final void a(oz6 oz6Var) {
            z65.h(oz6Var, "coordinator");
            sm7 u1 = oz6Var.u1();
            if (u1 != null) {
                u1.invalidate();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(oz6 oz6Var) {
            a(oz6Var);
            return Unit.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loz6;", "coordinator", "", "a", "(Loz6;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: oz6$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<oz6, Unit> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final void a(oz6 oz6Var) {
            z65.h(oz6Var, "coordinator");
            if (oz6Var.b0()) {
                im5 im5Var = oz6Var.v;
                if (im5Var == null) {
                    oz6.n2(oz6Var, false, 1, null);
                    return;
                }
                oz6.X.a(im5Var);
                oz6.n2(oz6Var, false, 1, null);
                if (!oz6.X.c(im5Var)) {
                    en5 L0 = oz6Var.L0();
                    jn5 O = L0.O();
                    if (O.r() > 0) {
                        if (O.s() || O.t()) {
                            en5.c1(L0, false, 1, null);
                        }
                        O.D().U0();
                    }
                    um7 g0 = L0.g0();
                    if (g0 != null) {
                        g0.f(L0);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(oz6 oz6Var) {
            a(oz6Var);
            return Unit.a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Loz6$e;", "", "Loz6$f;", "PointerInputSource", "Loz6$f;", "a", "()Loz6$f;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/d;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/d;", "Lkotlin/Function1;", "Loz6;", "", "onCommitAffectingLayer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayerParams", "Lim5;", "tmpLayerPositionalProperties", "Lim5;", "Loa6;", "tmpMatrix", "[F", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: oz6$e */
    /* loaded from: classes.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return oz6.Z;
        }

        public final f b() {
            return oz6.S4;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J=\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H&ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Loz6$f;", "", "Lqz6;", "b", "()I", "Lsm6$c;", "node", "", "a", "Len5;", "parentLayoutNode", DateTokenConverter.CONVERTER_KEY, "layoutNode", "Ls67;", "pointerPosition", "Lqo4;", "hitTestResult", "isTouchEvent", "isInLayer", "", com.huawei.hms.opendevice.c.a, "(Len5;JLqo4;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: oz6$f */
    /* loaded from: classes.dex */
    public interface f {
        boolean a(sm6.c cVar);

        int b();

        void c(en5 en5Var, long j, qo4 qo4Var, boolean z, boolean z2);

        boolean d(en5 en5Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oz6$g */
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ sm6.c b;
        final /* synthetic */ f c;
        final /* synthetic */ long d;
        final /* synthetic */ qo4 e;
        final /* synthetic */ boolean f;
        final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(sm6.c cVar, f fVar, long j, qo4 qo4Var, boolean z, boolean z2) {
            super(0);
            this.b = cVar;
            this.c = fVar;
            this.d = j;
            this.e = qo4Var;
            this.f = z;
            this.g = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            oz6.this.G1(pz6.a(this.b, this.c.b(), qz6.a(2)), this.c, this.d, this.e, this.f, this.g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oz6$h */
    /* loaded from: classes.dex */
    public static final class h extends ej5 implements Function0<Unit> {
        final /* synthetic */ sm6.c b;
        final /* synthetic */ f c;
        final /* synthetic */ long d;
        final /* synthetic */ qo4 e;
        final /* synthetic */ boolean f;
        final /* synthetic */ boolean g;
        final /* synthetic */ float h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(sm6.c cVar, f fVar, long j, qo4 qo4Var, boolean z, boolean z2, float f) {
            super(0);
            this.b = cVar;
            this.c = fVar;
            this.d = j;
            this.e = qo4Var;
            this.f = z;
            this.g = z2;
            this.h = f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            oz6.this.H1(pz6.a(this.b, this.c.b(), qz6.a(2)), this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oz6$i */
    /* loaded from: classes.dex */
    static final class i extends ej5 implements Function0<Unit> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            oz6 B1 = oz6.this.B1();
            if (B1 != null) {
                B1.K1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oz6$j */
    /* loaded from: classes.dex */
    public static final class j extends ej5 implements Function0<Unit> {
        final /* synthetic */ qn0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(qn0 qn0Var) {
            super(0);
            this.b = qn0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            oz6.this.m1(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oz6$k */
    /* loaded from: classes.dex */
    public static final class k extends ej5 implements Function0<Unit> {
        final /* synthetic */ sm6.c b;
        final /* synthetic */ f c;
        final /* synthetic */ long d;
        final /* synthetic */ qo4 e;
        final /* synthetic */ boolean f;
        final /* synthetic */ boolean g;
        final /* synthetic */ float h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(sm6.c cVar, f fVar, long j, qo4 qo4Var, boolean z, boolean z2, float f) {
            super(0);
            this.b = cVar;
            this.c = fVar;
            this.d = j;
            this.e = qo4Var;
            this.f = z;
            this.g = z2;
            this.h = f;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            oz6.this.g2(pz6.a(this.b, this.c.b(), qz6.a(2)), this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oz6$l */
    /* loaded from: classes.dex */
    public static final class l extends ej5 implements Function0<Unit> {
        final /* synthetic */ Function1<androidx.compose.ui.graphics.c, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
            super(0);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.invoke(oz6.I);
        }
    }

    public oz6(en5 en5Var) {
        z65.h(en5Var, "layoutNode");
        this.h = en5Var;
        this.n = L0().H();
        this.o = L0().getLayoutDirection();
        this.p = 0.8f;
        this.s = s55.b.a();
        this.w = new i();
    }

    private final boolean D1(int i2) {
        sm6.c F1 = F1(rz6.i(i2));
        if (F1 == null || !au2.e(F1, i2)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sm6.c F1(boolean z2) {
        sm6.c z1;
        if (L0().f0() == this) {
            return L0().e0().k();
        }
        if (z2) {
            oz6 oz6Var = this.j;
            if (oz6Var != null && (z1 = oz6Var.z1()) != null) {
                return z1.D0();
            }
        } else {
            oz6 oz6Var2 = this.j;
            if (oz6Var2 != null) {
                return oz6Var2.z1();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(sm6.c cVar, f fVar, long j2, qo4 qo4Var, boolean z2, boolean z3) {
        if (cVar == null) {
            J1(fVar, j2, qo4Var, z2, z3);
        } else {
            qo4Var.A(cVar, z3, new g(cVar, fVar, j2, qo4Var, z2, z3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(sm6.c cVar, f fVar, long j2, qo4 qo4Var, boolean z2, boolean z3, float f2) {
        if (cVar == null) {
            J1(fVar, j2, qo4Var, z2, z3);
        } else {
            qo4Var.B(cVar, f2, z3, new h(cVar, fVar, j2, qo4Var, z2, z3, f2));
        }
    }

    private final long O1(long j2) {
        float v0;
        float i0;
        float l2 = s67.l(j2);
        if (l2 < 0.0f) {
            v0 = -l2;
        } else {
            v0 = l2 - v0();
        }
        float max = Math.max(0.0f, v0);
        float m = s67.m(j2);
        if (m < 0.0f) {
            i0 = -m;
        } else {
            i0 = m - i0();
        }
        return x67.a(max, Math.max(0.0f, i0));
    }

    private final void X1(long j2, float f2, Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
        l2(this, function1, false, 2, null);
        if (!s55.g(O0(), j2)) {
            c2(j2);
            L0().O().D().U0();
            sm7 sm7Var = this.y;
            if (sm7Var != null) {
                sm7Var.h(j2);
            } else {
                oz6 oz6Var = this.j;
                if (oz6Var != null) {
                    oz6Var.K1();
                }
            }
            P0(this);
            um7 g0 = L0().g0();
            if (g0 != null) {
                g0.i(L0());
            }
        }
        this.t = f2;
    }

    public static /* synthetic */ void a2(oz6 oz6Var, zq6 zq6Var, boolean z2, boolean z3, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z3 = false;
            }
            oz6Var.Z1(zq6Var, z2, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    private final void g1(oz6 oz6Var, zq6 zq6Var, boolean z2) {
        if (oz6Var == this) {
            return;
        }
        oz6 oz6Var2 = this.j;
        if (oz6Var2 != null) {
            oz6Var2.g1(oz6Var, zq6Var, z2);
        }
        q1(zq6Var, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(sm6.c cVar, f fVar, long j2, qo4 qo4Var, boolean z2, boolean z3, float f2) {
        if (cVar == null) {
            J1(fVar, j2, qo4Var, z2, z3);
        } else if (fVar.a(cVar)) {
            qo4Var.G(cVar, f2, z3, new k(cVar, fVar, j2, qo4Var, z2, z3, f2));
        } else {
            g2(pz6.a(cVar, fVar.b(), qz6.a(2)), fVar, j2, qo4Var, z2, z3, f2);
        }
    }

    private final long h1(oz6 oz6Var, long j2) {
        if (oz6Var == this) {
            return j2;
        }
        oz6 oz6Var2 = this.j;
        if (oz6Var2 != null && !z65.c(oz6Var, oz6Var2)) {
            return p1(oz6Var2.h1(oz6Var, j2));
        }
        return p1(j2);
    }

    private final oz6 h2(om5 om5Var) {
        uy5 uy5Var;
        oz6 b2;
        if (om5Var instanceof uy5) {
            uy5Var = (uy5) om5Var;
        } else {
            uy5Var = null;
        }
        if (uy5Var == null || (b2 = uy5Var.b()) == null) {
            z65.f(om5Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return (oz6) om5Var;
        }
        return b2;
    }

    public static /* synthetic */ void l2(oz6 oz6Var, Function1 function1, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            oz6Var.k2(function1, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1(qn0 qn0Var) {
        sm6.c E1 = E1(qz6.a(4));
        if (E1 == null) {
            W1(qn0Var);
        } else {
            L0().V().b(qn0Var, x55.c(a()), this, E1);
        }
    }

    private final void m2(boolean z2) {
        um7 g0;
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            Function1<? super androidx.compose.ui.graphics.c, Unit> function1 = this.m;
            if (function1 != null) {
                androidx.compose.ui.graphics.d dVar = I;
                dVar.v();
                dVar.x(L0().H());
                dVar.B(x55.c(a()));
                y1().h(this, A, new l(function1));
                im5 im5Var = this.v;
                if (im5Var == null) {
                    im5Var = new im5();
                    this.v = im5Var;
                }
                im5Var.b(dVar);
                float X2 = dVar.X();
                float z0 = dVar.z0();
                float b2 = dVar.b();
                float p0 = dVar.p0();
                float l0 = dVar.l0();
                float q = dVar.q();
                long d2 = dVar.d();
                long u = dVar.u();
                float r0 = dVar.r0();
                float w = dVar.w();
                float A2 = dVar.A();
                float K = dVar.K();
                long N = dVar.N();
                tga r = dVar.r();
                boolean e2 = dVar.e();
                dVar.p();
                sm7Var.g(X2, z0, b2, p0, l0, q, r0, w, A2, K, N, r, e2, null, d2, u, dVar.m(), L0().getLayoutDirection(), L0().H());
                this.l = dVar.e();
                this.p = dVar.b();
                if (z2 && (g0 = L0().g0()) != null) {
                    g0.i(L0());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (this.m == null) {
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    static /* synthetic */ void n2(oz6 oz6Var, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z2 = true;
            }
            oz6Var.m2(z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
    }

    private final void q1(zq6 zq6Var, boolean z2) {
        float h2 = s55.h(O0());
        zq6Var.i(zq6Var.b() - h2);
        zq6Var.j(zq6Var.c() - h2);
        float i2 = s55.i(O0());
        zq6Var.k(zq6Var.d() - i2);
        zq6Var.h(zq6Var.a() - i2);
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            sm7Var.a(zq6Var, true);
            if (this.l && z2) {
                zq6Var.e(0.0f, 0.0f, w55.g(a()), w55.f(a()));
                zq6Var.f();
            }
        }
    }

    private final wm7 y1() {
        return in5.b(L0()).getSnapshotObserver();
    }

    public final oz6 A1() {
        return this.i;
    }

    @Override // defpackage.om5
    public long B(long j2) {
        return in5.b(L0()).b(I(j2));
    }

    public final oz6 B1() {
        return this.j;
    }

    public final float C1() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gb8
    public void D0(long j2, float f2, Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
        X1(j2, f2, function1);
    }

    public final sm6.c E1(int i2) {
        boolean i3 = rz6.i(i2);
        sm6.c z1 = z1();
        if (i3 || (z1 = z1.J0()) != null) {
            for (sm6.c F1 = F1(i3); F1 != null && (F1.C0() & i2) != 0; F1 = F1.D0()) {
                if ((F1.H0() & i2) != 0) {
                    return F1;
                }
                if (F1 == z1) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.om5
    public final om5 F() {
        if (p()) {
            P1();
            return L0().f0().j;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // defpackage.om5
    public long I(long j2) {
        if (p()) {
            P1();
            for (oz6 oz6Var = this; oz6Var != null; oz6Var = oz6Var.j) {
                j2 = oz6Var.i2(j2);
            }
            return j2;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // defpackage.sy5
    public sy5 I0() {
        return this.i;
    }

    public final void I1(f fVar, long j2, qo4 qo4Var, boolean z2, boolean z3) {
        float j1;
        z65.h(fVar, "hitTestSource");
        z65.h(qo4Var, "hitTestResult");
        sm6.c E1 = E1(fVar.b());
        if (!o2(j2)) {
            if (z2) {
                float j12 = j1(j2, w1());
                if (!Float.isInfinite(j12) && !Float.isNaN(j12) && qo4Var.D(j12, false)) {
                    H1(E1, fVar, j2, qo4Var, z2, false, j12);
                }
            }
        } else if (E1 == null) {
            J1(fVar, j2, qo4Var, z2, z3);
        } else if (M1(j2)) {
            G1(E1, fVar, j2, qo4Var, z2, z3);
        } else {
            if (!z2) {
                j1 = Float.POSITIVE_INFINITY;
            } else {
                j1 = j1(j2, w1());
            }
            if (!Float.isInfinite(j1) && !Float.isNaN(j1)) {
                if (qo4Var.D(j1, z3)) {
                    H1(E1, fVar, j2, qo4Var, z2, z3, j1);
                    return;
                }
            }
            g2(E1, fVar, j2, qo4Var, z2, z3, j1);
        }
    }

    public void J1(f fVar, long j2, qo4 qo4Var, boolean z2, boolean z3) {
        z65.h(fVar, "hitTestSource");
        z65.h(qo4Var, "hitTestResult");
        oz6 oz6Var = this.i;
        if (oz6Var != null) {
            oz6Var.I1(fVar, oz6Var.p1(j2), qo4Var, z2, z3);
        }
    }

    @Override // defpackage.sy5
    public boolean K0() {
        if (this.q != null) {
            return true;
        }
        return false;
    }

    public void K1() {
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            sm7Var.invalidate();
            return;
        }
        oz6 oz6Var = this.j;
        if (oz6Var != null) {
            oz6Var.K1();
        }
    }

    @Override // defpackage.sy5
    public en5 L0() {
        return this.h;
    }

    public void L1(qn0 qn0Var) {
        z65.h(qn0Var, "canvas");
        if (L0().b()) {
            y1().h(this, B, new j(qn0Var));
            this.x = false;
            return;
        }
        this.x = true;
    }

    @Override // defpackage.sy5
    public tb6 M0() {
        tb6 tb6Var = this.q;
        if (tb6Var != null) {
            return tb6Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    protected final boolean M1(long j2) {
        float l2 = s67.l(j2);
        float m = s67.m(j2);
        if (l2 >= 0.0f && m >= 0.0f && l2 < v0() && m < i0()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sy5
    public sy5 N0() {
        return this.j;
    }

    public final boolean N1() {
        if (this.y != null && this.p <= 0.0f) {
            return true;
        }
        oz6 oz6Var = this.j;
        if (oz6Var != null) {
            return oz6Var.N1();
        }
        return false;
    }

    @Override // defpackage.sy5
    public long O0() {
        return this.s;
    }

    public final void P1() {
        L0().O().O();
    }

    public void Q1() {
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            sm7Var.invalidate();
        }
    }

    public final void R1() {
        k2(this.m, true);
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            sm7Var.invalidate();
        }
    }

    @Override // defpackage.sy5
    public void S0() {
        D0(O0(), this.t, this.m);
    }

    protected void S1(int i2, int i3) {
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            sm7Var.c(x55.a(i2, i3));
        } else {
            oz6 oz6Var = this.j;
            if (oz6Var != null) {
                oz6Var.K1();
            }
        }
        E0(x55.a(i2, i3));
        m2(false);
        int a2 = qz6.a(4);
        boolean i4 = rz6.i(a2);
        sm6.c z1 = z1();
        if (i4 || (z1 = z1.J0()) != null) {
            for (sm6.c F1 = F1(i4); F1 != null && (F1.C0() & a2) != 0; F1 = F1.D0()) {
                if ((F1.H0() & a2) != 0) {
                    sm6.c cVar = F1;
                    gr6 gr6Var = null;
                    while (cVar != null) {
                        if (cVar instanceof v73) {
                            ((v73) cVar).i0();
                        } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                            int i5 = 0;
                            for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                if ((g1.H0() & a2) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        cVar = g1;
                                    } else {
                                        if (gr6Var == null) {
                                            gr6Var = new gr6(new sm6.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            gr6Var.b(cVar);
                                            cVar = null;
                                        }
                                        gr6Var.b(g1);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                        cVar = au2.g(gr6Var);
                    }
                }
                if (F1 == z1) {
                    break;
                }
            }
        }
        um7 g0 = L0().g0();
        if (g0 != null) {
            g0.i(L0());
        }
    }

    public final void T1() {
        sm6.c J0;
        if (D1(qz6.a(128))) {
            yoa a2 = yoa.e.a();
            try {
                yoa l2 = a2.l();
                int a3 = qz6.a(128);
                boolean i2 = rz6.i(a3);
                if (i2) {
                    J0 = z1();
                } else {
                    J0 = z1().J0();
                    if (J0 == null) {
                        Unit unit = Unit.a;
                        a2.s(l2);
                    }
                }
                for (sm6.c F1 = F1(i2); F1 != null && (F1.C0() & a3) != 0; F1 = F1.D0()) {
                    if ((F1.H0() & a3) != 0) {
                        sm6.c cVar = F1;
                        gr6 gr6Var = null;
                        while (cVar != null) {
                            if (cVar instanceof km5) {
                                ((km5) cVar).b(j0());
                            } else if ((cVar.H0() & a3) != 0 && (cVar instanceof fu2)) {
                                int i3 = 0;
                                for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                    if ((g1.H0() & a3) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cVar = g1;
                                        } else {
                                            if (gr6Var == null) {
                                                gr6Var = new gr6(new sm6.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                gr6Var.b(cVar);
                                                cVar = null;
                                            }
                                            gr6Var.b(g1);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            cVar = au2.g(gr6Var);
                        }
                    }
                    if (F1 == J0) {
                        break;
                    }
                }
                Unit unit2 = Unit.a;
                a2.s(l2);
            } finally {
                a2.d();
            }
        }
    }

    public final void U1() {
        int a2 = qz6.a(128);
        boolean i2 = rz6.i(a2);
        sm6.c z1 = z1();
        if (i2 || (z1 = z1.J0()) != null) {
            for (sm6.c F1 = F1(i2); F1 != null && (F1.C0() & a2) != 0; F1 = F1.D0()) {
                if ((F1.H0() & a2) != 0) {
                    sm6.c cVar = F1;
                    gr6 gr6Var = null;
                    while (cVar != null) {
                        if (cVar instanceof km5) {
                            ((km5) cVar).m(this);
                        } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                            int i3 = 0;
                            for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                if ((g1.H0() & a2) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        cVar = g1;
                                    } else {
                                        if (gr6Var == null) {
                                            gr6Var = new gr6(new sm6.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            gr6Var.b(cVar);
                                            cVar = null;
                                        }
                                        gr6Var.b(g1);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        cVar = au2.g(gr6Var);
                    }
                }
                if (F1 == z1) {
                    return;
                }
            }
        }
    }

    public final void V1() {
        this.k = true;
        if (this.y != null) {
            l2(this, null, false, 2, null);
        }
    }

    public void W1(qn0 qn0Var) {
        z65.h(qn0Var, "canvas");
        oz6 oz6Var = this.i;
        if (oz6Var != null) {
            oz6Var.k1(qn0Var);
        }
    }

    public final void Y1(long j2, float f2, Function1<? super androidx.compose.ui.graphics.c, Unit> function1) {
        long W = W();
        X1(t55.a(s55.h(j2) + s55.h(W), s55.i(j2) + s55.i(W)), f2, function1);
    }

    public final void Z1(zq6 zq6Var, boolean z2, boolean z3) {
        z65.h(zq6Var, "bounds");
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            if (this.l) {
                if (z3) {
                    long w1 = w1();
                    float i2 = cna.i(w1) / 2.0f;
                    float g2 = cna.g(w1) / 2.0f;
                    zq6Var.e(-i2, -g2, w55.g(a()) + i2, w55.f(a()) + g2);
                } else if (z2) {
                    zq6Var.e(0.0f, 0.0f, w55.g(a()), w55.f(a()));
                }
                if (zq6Var.f()) {
                    return;
                }
            }
            sm7Var.a(zq6Var, false);
        }
        float h2 = s55.h(O0());
        zq6Var.i(zq6Var.b() + h2);
        zq6Var.j(zq6Var.c() + h2);
        float i3 = s55.i(O0());
        zq6Var.k(zq6Var.d() + i3);
        zq6Var.h(zq6Var.a() + i3);
    }

    @Override // defpackage.om5
    public final long a() {
        return j0();
    }

    @Override // defpackage.vm7
    public boolean b0() {
        if (this.y != null && p()) {
            return true;
        }
        return false;
    }

    public void b2(tb6 tb6Var) {
        z65.h(tb6Var, "value");
        tb6 tb6Var2 = this.q;
        if (tb6Var != tb6Var2) {
            this.q = tb6Var;
            if (tb6Var2 == null || tb6Var.getWidth() != tb6Var2.getWidth() || tb6Var.getHeight() != tb6Var2.getHeight()) {
                S1(tb6Var.getWidth(), tb6Var.getHeight());
            }
            Map<hb, Integer> map = this.r;
            if (((map != null && !map.isEmpty()) || (!tb6Var.d().isEmpty())) && !z65.c(tb6Var.d(), this.r)) {
                r1().d().m();
                Map map2 = this.r;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.r = map2;
                }
                map2.clear();
                map2.putAll(tb6Var.d());
            }
        }
    }

    protected void c2(long j2) {
        this.s = j2;
    }

    public final void d2(oz6 oz6Var) {
        this.i = oz6Var;
    }

    public final void e2(oz6 oz6Var) {
        this.j = oz6Var;
    }

    public final boolean f2() {
        sm6.c F1 = F1(rz6.i(qz6.a(16)));
        if (F1 == null) {
            return false;
        }
        int a2 = qz6.a(16);
        if (F1.I().M0()) {
            sm6.c I2 = F1.I();
            if ((I2.C0() & a2) != 0) {
                for (sm6.c D0 = I2.D0(); D0 != null; D0 = D0.D0()) {
                    if ((D0.H0() & a2) != 0) {
                        sm6.c cVar = D0;
                        gr6 gr6Var = null;
                        while (cVar != null) {
                            if (cVar instanceof fe8) {
                                if (((fe8) cVar).v0()) {
                                    return true;
                                }
                            } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                                int i2 = 0;
                                for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                    if ((g1.H0() & a2) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVar = g1;
                                        } else {
                                            if (gr6Var == null) {
                                                gr6Var = new gr6(new sm6.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                gr6Var.b(cVar);
                                                cVar = null;
                                            }
                                            gr6Var.b(g1);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVar = au2.g(gr6Var);
                        }
                        continue;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    @Override // defpackage.a03
    public float getDensity() {
        return L0().H().getDensity();
    }

    @Override // defpackage.y65
    public qm5 getLayoutDirection() {
        return L0().getLayoutDirection();
    }

    protected final long i1(long j2) {
        return ina.a(Math.max(0.0f, (cna.i(j2) - v0()) / 2.0f), Math.max(0.0f, (cna.g(j2) - i0()) / 2.0f));
    }

    public long i2(long j2) {
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            j2 = sm7Var.b(j2, false);
        }
        return t55.c(j2, O0());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(qn0 qn0Var) {
        L1(qn0Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float j1(long j2, long j3) {
        if (v0() >= cna.i(j3) && i0() >= cna.g(j3)) {
            return Float.POSITIVE_INFINITY;
        }
        long i1 = i1(j3);
        float i2 = cna.i(i1);
        float g2 = cna.g(i1);
        long O1 = O1(j2);
        if ((i2 <= 0.0f && g2 <= 0.0f) || s67.l(O1) > i2 || s67.m(O1) > g2) {
            return Float.POSITIVE_INFINITY;
        }
        return s67.k(O1);
    }

    public final k99 j2() {
        if (!p()) {
            return k99.e.a();
        }
        om5 d2 = pm5.d(this);
        zq6 x1 = x1();
        long i1 = i1(w1());
        x1.i(-cna.i(i1));
        x1.k(-cna.g(i1));
        x1.j(v0() + cna.i(i1));
        x1.h(i0() + cna.g(i1));
        oz6 oz6Var = this;
        while (oz6Var != d2) {
            oz6Var.Z1(x1, false, true);
            if (x1.f()) {
                return k99.e.a();
            }
            oz6Var = oz6Var.j;
            z65.e(oz6Var);
        }
        return ar6.a(x1);
    }

    @Override // defpackage.a03
    public float k0() {
        return L0().H().k0();
    }

    public final void k1(qn0 qn0Var) {
        z65.h(qn0Var, "canvas");
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            sm7Var.f(qn0Var);
            return;
        }
        float h2 = s55.h(O0());
        float i2 = s55.i(O0());
        qn0Var.a(h2, i2);
        m1(qn0Var);
        qn0Var.a(-h2, -i2);
    }

    public final void k2(Function1<? super androidx.compose.ui.graphics.c, Unit> function1, boolean z2) {
        boolean z3;
        um7 g0;
        en5 L0 = L0();
        if (!z2 && this.m == function1 && z65.c(this.n, L0.H()) && this.o == L0.getLayoutDirection()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.m = function1;
        this.n = L0.H();
        this.o = L0.getLayoutDirection();
        if (p() && function1 != null) {
            if (this.y == null) {
                sm7 m = in5.b(L0).m(this, this.w);
                m.c(j0());
                m.h(O0());
                this.y = m;
                n2(this, false, 1, null);
                L0.j1(true);
                this.w.invoke();
                return;
            } else if (z3) {
                n2(this, false, 1, null);
                return;
            } else {
                return;
            }
        }
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            sm7Var.destroy();
            L0.j1(true);
            this.w.invoke();
            if (p() && (g0 = L0.g0()) != null) {
                g0.i(L0);
            }
        }
        this.y = null;
        this.x = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l1(qn0 qn0Var, pp7 pp7Var) {
        z65.h(qn0Var, "canvas");
        z65.h(pp7Var, "paint");
        qn0Var.i(new k99(0.5f, 0.5f, w55.g(j0()) - 0.5f, w55.f(j0()) - 0.5f), pp7Var);
    }

    public abstract void n1();

    public final oz6 o1(oz6 oz6Var) {
        z65.h(oz6Var, "other");
        en5 L0 = oz6Var.L0();
        en5 L02 = L0();
        if (L0 == L02) {
            sm6.c z1 = oz6Var.z1();
            sm6.c z12 = z1();
            int a2 = qz6.a(2);
            if (z12.I().M0()) {
                for (sm6.c J0 = z12.I().J0(); J0 != null; J0 = J0.J0()) {
                    if ((J0.H0() & a2) != 0 && J0 == z1) {
                        return oz6Var;
                    }
                }
                return this;
            }
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        while (L0.I() > L02.I()) {
            L0 = L0.h0();
            z65.e(L0);
        }
        while (L02.I() > L0.I()) {
            L02 = L02.h0();
            z65.e(L02);
        }
        while (L0 != L02) {
            L0 = L0.h0();
            L02 = L02.h0();
            if (L0 != null) {
                if (L02 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (L02 == L0()) {
            return this;
        }
        if (L0 != oz6Var.L0()) {
            return L0.L();
        }
        return oz6Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean o2(long j2) {
        if (!x67.b(j2)) {
            return false;
        }
        sm7 sm7Var = this.y;
        if (sm7Var != null && this.l && !sm7Var.e(j2)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.om5
    public boolean p() {
        if (!this.k && L0().C0()) {
            return true;
        }
        return false;
    }

    public long p1(long j2) {
        long b2 = t55.b(j2, O0());
        sm7 sm7Var = this.y;
        if (sm7Var != null) {
            return sm7Var.b(b2, true);
        }
        return b2;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // defpackage.x65
    public Object r() {
        if (!L0().e0().q(qz6.a(64))) {
            return null;
        }
        z1();
        ea9 ea9Var = new ea9();
        for (sm6.c o = L0().e0().o(); o != null; o = o.J0()) {
            if ((qz6.a(64) & o.H0()) != 0) {
                int a2 = qz6.a(64);
                gr6 gr6Var = null;
                sm6.c cVar = o;
                while (cVar != null) {
                    if (cVar instanceof wq7) {
                        ea9Var.a = ((wq7) cVar).d(L0().H(), ea9Var.a);
                    } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                        int i2 = 0;
                        for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                            if ((g1.H0() & a2) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    cVar = g1;
                                } else {
                                    if (gr6Var == null) {
                                        gr6Var = new gr6(new sm6.c[16], 0);
                                    }
                                    if (cVar != null) {
                                        gr6Var.b(cVar);
                                        cVar = null;
                                    }
                                    gr6Var.b(g1);
                                }
                            }
                        }
                        if (i2 == 1) {
                        }
                    }
                    cVar = au2.g(gr6Var);
                }
            }
        }
        return ea9Var.a;
    }

    public kb r1() {
        return L0().O().q();
    }

    public final boolean s1() {
        return this.x;
    }

    public final long t1() {
        return x0();
    }

    public final sm7 u1() {
        return this.y;
    }

    @Override // defpackage.om5
    public long v(om5 om5Var, long j2) {
        z65.h(om5Var, "sourceCoordinates");
        if (om5Var instanceof uy5) {
            return s67.s(om5Var.v(this, s67.s(j2)));
        }
        oz6 h2 = h2(om5Var);
        h2.P1();
        oz6 o1 = o1(h2);
        while (h2 != o1) {
            j2 = h2.i2(j2);
            h2 = h2.j;
            z65.e(h2);
        }
        return h1(o1, j2);
    }

    public abstract ty5 v1();

    public final long w1() {
        return this.n.w0(L0().k0().c());
    }

    @Override // defpackage.om5
    public k99 x(om5 om5Var, boolean z2) {
        z65.h(om5Var, "sourceCoordinates");
        if (p()) {
            if (om5Var.p()) {
                oz6 h2 = h2(om5Var);
                h2.P1();
                oz6 o1 = o1(h2);
                zq6 x1 = x1();
                x1.i(0.0f);
                x1.k(0.0f);
                x1.j(w55.g(om5Var.a()));
                x1.h(w55.f(om5Var.a()));
                while (h2 != o1) {
                    a2(h2, x1, z2, false, 4, null);
                    if (x1.f()) {
                        return k99.e.a();
                    }
                    h2 = h2.j;
                    z65.e(h2);
                }
                g1(o1, x1, z2);
                return ar6.a(x1);
            }
            throw new IllegalStateException(("LayoutCoordinates " + om5Var + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    protected final zq6 x1() {
        zq6 zq6Var = this.u;
        if (zq6Var == null) {
            zq6 zq6Var2 = new zq6(0.0f, 0.0f, 0.0f, 0.0f);
            this.u = zq6Var2;
            return zq6Var2;
        }
        return zq6Var;
    }

    public abstract sm6.c z1();

    @Override // defpackage.sy5
    public om5 J0() {
        return this;
    }
}
