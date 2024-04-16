package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb8;
import defpackage.jn5;
import defpackage.sm6;
import defpackage.um7;
import im.threads.business.transport.MessageAttributes;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LayoutNode.kt */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 Å\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004[ZvWB\u001d\u0012\b\b\u0002\u0010_\u001a\u00020:\u0012\b\b\u0002\u0010f\u001a\u00020\r¢\u0006\u0006\bÃ\u0002\u0010Ä\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\u000f\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u0017J\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0000¢\u0006\u0004\b \u0010\u0017J'\u0010#\u001a\u00020\b2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010\u0017J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010\u0017J\b\u0010+\u001a\u00020\u000fH\u0016J\u000f\u0010,\u001a\u00020\bH\u0000¢\u0006\u0004\b,\u0010\u0017J\u000f\u0010-\u001a\u00020\bH\u0000¢\u0006\u0004\b-\u0010\u0017J\u001f\u0010/\u001a\u00020\b2\u0006\u0010*\u001a\u00020\r2\u0006\u0010.\u001a\u00020\rH\u0000¢\u0006\u0004\b/\u0010\u001fJ\u000f\u00100\u001a\u00020\bH\u0000¢\u0006\u0004\b0\u0010\u0017J\u000f\u00101\u001a\u00020\bH\u0000¢\u0006\u0004\b1\u0010\u0017J\u0017\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\b4\u00105J9\u0010=\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J9\u0010@\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u0010?\u001a\u0002082\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010>J\u0017\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020\u0000H\u0000¢\u0006\u0004\bB\u0010CJ#\u0010F\u001a\u00020\b2\b\b\u0002\u0010D\u001a\u00020:2\b\b\u0002\u0010E\u001a\u00020:H\u0000¢\u0006\u0004\bF\u0010GJ#\u0010H\u001a\u00020\b2\b\b\u0002\u0010D\u001a\u00020:2\b\b\u0002\u0010E\u001a\u00020:H\u0000¢\u0006\u0004\bH\u0010GJ\u000f\u0010I\u001a\u00020\bH\u0000¢\u0006\u0004\bI\u0010\u0017J\u0019\u0010J\u001a\u00020\b2\b\b\u0002\u0010D\u001a\u00020:H\u0000¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u00020\b2\b\b\u0002\u0010D\u001a\u00020:H\u0000¢\u0006\u0004\bL\u0010KJ\u000f\u0010.\u001a\u00020\bH\u0000¢\u0006\u0004\b.\u0010\u0017J\u000f\u0010M\u001a\u00020\bH\u0000¢\u0006\u0004\bM\u0010\u0017J!\u0010P\u001a\u00020:2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010NH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJ!\u0010R\u001a\u00020:2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010NH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010QJ\u000f\u0010S\u001a\u00020\bH\u0000¢\u0006\u0004\bS\u0010\u0017J\u000f\u0010T\u001a\u00020\bH\u0000¢\u0006\u0004\bT\u0010\u0017J\u000f\u0010U\u001a\u00020\bH\u0000¢\u0006\u0004\bU\u0010\u0017J\u000f\u0010V\u001a\u00020\bH\u0000¢\u0006\u0004\bV\u0010\u0017J\b\u0010W\u001a\u00020\bH\u0016J\u000f\u0010X\u001a\u00020\bH\u0000¢\u0006\u0004\bX\u0010\u0017J\u000f\u0010Y\u001a\u00020\bH\u0000¢\u0006\u0004\bY\u0010\u0017J\b\u0010Z\u001a\u00020\bH\u0016J\b\u0010[\u001a\u00020\bH\u0016J\b\u0010\\\u001a\u00020\bH\u0016R\u0014\u0010_\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010f\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR0\u0010k\u001a\u00020\r2\u0006\u0010g\u001a\u00020\r8W@WX\u0097\u000e¢\u0006\u0018\n\u0004\bh\u0010a\u0012\u0004\bj\u0010\u0017\u001a\u0004\bi\u0010c\"\u0004\bh\u0010eR\"\u0010o\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010^\u001a\u0004\bl\u0010m\"\u0004\bn\u0010KR.\u0010u\u001a\u0004\u0018\u00010\u00002\b\u0010p\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010CR\u0016\u0010w\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010aR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00000x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010yR\u001e\u0010~\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010\u007f\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010^R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010qR,\u0010'\u001a\u0004\u0018\u00010&2\b\u0010g\u001a\u0004\u0018\u00010&8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R3\u0010\u008e\u0001\u001a\f\u0018\u00010\u0086\u0001j\u0005\u0018\u0001`\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R$\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0005\b\u008f\u0001\u0010a\u001a\u0004\ba\u0010c\"\u0005\b\u0090\u0001\u0010eR\u0018\u0010\u0092\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010^R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000{8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010}R\u0018\u0010\u009a\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010^R3\u0010¢\u0001\u001a\u00030\u009b\u00012\b\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0005\b|\u0010¡\u0001R\u001f\u0010§\u0001\u001a\u00030£\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b(\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R2\u0010\u00ad\u0001\u001a\u00030¨\u00012\b\u0010\u009c\u0001\u001a\u00030¨\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\bX\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0005\bv\u0010¬\u0001R2\u0010³\u0001\u001a\u00030®\u00012\b\u0010\u009c\u0001\u001a\u00030®\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u0015\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0005\b]\u0010²\u0001R3\u0010¹\u0001\u001a\u00030´\u00012\b\u0010\u009c\u0001\u001a\u00030´\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u0010\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b\u008f\u0001\u0010¸\u0001R4\u0010À\u0001\u001a\u00030º\u00012\b\u0010\u009c\u0001\u001a\u00030º\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b\u0082\u0001\u0010¿\u0001R)\u0010Ç\u0001\u001a\u00030Á\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b*\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010È\u0001\u001a\u00030Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010Â\u0001R,\u0010Ì\u0001\u001a\u00020:8\u0000@\u0000X\u0081\u000e¢\u0006\u001b\n\u0004\b4\u0010^\u0012\u0005\bË\u0001\u0010\u0017\u001a\u0005\bÉ\u0001\u0010m\"\u0005\bÊ\u0001\u0010KR \u0010Ò\u0001\u001a\u00030Í\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R \u0010×\u0001\u001a\u00030Ó\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001b\u0010Ú\u0001\u001a\u0005\u0018\u00010Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010Ù\u0001R&\u0010Þ\u0001\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bÛ\u0001\u0010^\u001a\u0005\bÜ\u0001\u0010m\"\u0005\bÝ\u0001\u0010KR4\u0010ä\u0001\u001a\u00030ß\u00012\b\u0010\u009c\u0001\u001a\u00030ß\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\b\u0088\u0001\u0010ã\u0001R7\u0010ë\u0001\u001a\u0011\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b\u0018\u00010å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R8\u0010ï\u0001\u001a\u0011\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b\u0018\u00010å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bì\u0001\u0010æ\u0001\u001a\u0006\bí\u0001\u0010è\u0001\"\u0006\bî\u0001\u0010ê\u0001R&\u0010ó\u0001\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bð\u0001\u0010^\u001a\u0005\bñ\u0001\u0010m\"\u0005\bò\u0001\u0010KR\u0018\u0010õ\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bô\u0001\u0010^R\u0018\u0010ù\u0001\u001a\u00030ö\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010ø\u0001R\u001a\u0010ü\u0001\u001a\u0005\u0018\u00010Ø\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bú\u0001\u0010û\u0001R\u0016\u0010ÿ\u0001\u001a\u0004\u0018\u00010:8F¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R\u001f\u0010\u0084\u0002\u001a\n\u0012\u0005\u0012\u00030\u0081\u00020\u0080\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001f\u0010\u0086\u0002\u001a\n\u0012\u0005\u0012\u00030\u0081\u00020\u0080\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0083\u0002R\u001d\u0010\u0089\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000{8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R\u001e\u0010\u008b\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u0080\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010\u0083\u0002R\u0018\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0002\u0010sR\u0016\u0010\u008f\u0002\u001a\u00020:8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0002\u0010mR\u0018\u0010\u0093\u0002\u001a\u00030\u0090\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001f\u0010\u0097\u0002\u001a\n\u0018\u00010\u0094\u0002R\u00030Ó\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001d\u0010\u009b\u0002\u001a\b0\u0098\u0002R\u00030Ó\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001a\u0010\u009e\u0002\u001a\u0005\u0018\u00010\u0093\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010\u009d\u0002R$\u0010¡\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000{8@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b \u0002\u0010\u0017\u001a\u0006\b\u009f\u0002\u0010\u0088\u0002R\u0016\u0010£\u0002\u001a\u00020:8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¢\u0002\u0010mR\u0016\u0010¥\u0002\u001a\u00020:8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¤\u0002\u0010mR\u0016\u0010§\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¦\u0002\u0010cR\u0016\u0010©\u0002\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¨\u0002\u0010cR\u0016\u0010ª\u0002\u001a\u00020:8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010mR\u0018\u0010®\u0002\u001a\u00030«\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010\u00ad\u0002R\u0015\u0010¯\u0002\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010mR\u0016\u0010±\u0002\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b°\u0002\u0010cR\u0017\u0010²\u0002\u001a\u00030Á\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b^\u0010Ä\u0001R\u0018\u0010´\u0002\u001a\u00030Á\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b³\u0002\u0010Ä\u0001R\u0018\u0010¶\u0002\u001a\u00030Ø\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010û\u0001R\u0018\u0010¸\u0002\u001a\u00030Ø\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0002\u0010û\u0001R\u0018\u0010»\u0002\u001a\u00030¹\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010º\u0002R\u0016\u0010¼\u0002\u001a\u00020:8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010mR\u0016\u0010¾\u0002\u001a\u00020:8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b½\u0002\u0010mR\u0016\u0010À\u0002\u001a\u00020:8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¿\u0002\u0010mR\u0016\u0010Â\u0002\u001a\u00020:8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0002\u0010m\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Æ\u0002"}, d2 = {"Len5;", "Lkn1;", "Luc9;", "Lvm7;", "Ltm5;", "Lmn1;", "", "Lum7$b;", "", "R0", "B0", "child", "N0", "", "depth", "", "v", "O0", "g1", "u0", "v0", "u", "n1", "()V", "index", "instance", "t0", "(ILen5;)V", "P0", "count", "V0", "(II)V", "U0", RemoteMessageConst.FROM, RemoteMessageConst.TO, "M0", "(III)V", "A0", "Lum7;", "owner", Image.TYPE_SMALL, "(Lum7;)V", "x", "toString", "w0", "z0", "y", "Q0", "W0", "H0", "Lqn0;", "canvas", "z", "(Lqn0;)V", "Ls67;", "pointerPosition", "Lqo4;", "hitTestResult", "", "isTouchEvent", "isInLayer", "p0", "(JLqo4;ZZ)V", "hitSemanticsEntities", "r0", "it", "f1", "(Len5;)V", "forceRequest", "scheduleMeasureAndLayout", "d1", "(ZZ)V", "Z0", "y0", "b1", "(Z)V", "X0", "x0", "Lnr1;", "constraints", "F0", "(Lnr1;)Z", "S0", "I0", "L0", "J0", "K0", "g", "t", "h1", com.huawei.hms.push.e.a, DateTokenConverter.CONVERTER_KEY, "i", "a", "Z", "isVirtual", "b", "I", "j0", "()I", "m1", "(I)V", "semanticsId", "<set-?>", com.huawei.hms.opendevice.c.a, "getCompositeKeyHash", "getCompositeKeyHash$annotations", "compositeKeyHash", "E0", "()Z", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", "Len5;", "U", "()Len5;", "k1", "lookaheadRoot", "f", "virtualChildrenCount", "Lir6;", "Lir6;", "_foldedChildren", "Lgr6;", Image.TYPE_HIGH, "Lgr6;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "j", "_foldedParent", "k", "Lum7;", "g0", "()Lum7;", "Ljj;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "l", "Ljj;", "getInteropViewFactoryHolder$ui_release", "()Ljj;", "setInteropViewFactoryHolder$ui_release", "(Ljj;)V", "interopViewFactoryHolder", Image.TYPE_MEDIUM, "setDepth$ui_release", "n", "ignoreRemeasureRequests", "Ltaa;", "o", "Ltaa;", "_collapsedSemantics", "p", "_zSortedChildren", "q", "zSortedChildrenInvalidated", "Lqb6;", "value", "r", "Lqb6;", "Y", "()Lqb6;", "(Lqb6;)V", "measurePolicy", "Ld75;", "Ld75;", "getIntrinsicsPolicy$ui_release", "()Ld75;", "intrinsicsPolicy", "La03;", "La03;", "H", "()La03;", "(La03;)V", "density", "Lqm5;", "Lqm5;", "getLayoutDirection", "()Lqm5;", "(Lqm5;)V", "layoutDirection", "Lxyb;", "Lxyb;", "k0", "()Lxyb;", "(Lxyb;)V", "viewConfiguration", "Lpo1;", "w", "Lpo1;", "G", "()Lpo1;", "(Lpo1;)V", "compositionLocalMap", "Len5$g;", "Len5$g;", "N", "()Len5$g;", "setIntrinsicsUsageByParent$ui_release", "(Len5$g;)V", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "B", "i1", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "Lmz6;", "A", "Lmz6;", "e0", "()Lmz6;", "nodes", "Ljn5;", "Ljn5;", "O", "()Ljn5;", "layoutDelegate", "Loz6;", "Loz6;", "_innerLayerCoordinator", "X", "getInnerLayerCoordinatorIsDirty$ui_release", "j1", "innerLayerCoordinatorIsDirty", "Lsm6;", "Lsm6;", "c0", "()Lsm6;", "(Lsm6;)V", "modifier", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onAttach", "S4", "getOnDetach$ui_release", "setOnDetach$ui_release", "onDetach", "T4", "d0", "l1", "needsOnPositionedDispatch", "U4", "deactivated", "", "m0", "()F", "zIndex", "M", "()Loz6;", "innerLayerCoordinator", "D0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "", "Lmb6;", "D", "()Ljava/util/List;", "childMeasurables", "C", "childLookaheadMeasurables", "o0", "()Lgr6;", "_children", "E", "children", "h0", "parent", "C0", "isAttached", "Len5$e;", "Q", "()Len5$e;", "layoutState", "Ljn5$a;", "T", "()Ljn5$a;", "lookaheadPassDelegate", "Ljn5$b;", "W", "()Ljn5$b;", "measurePassDelegate", "F", "()Ltaa;", "collapsedSemantics", "n0", "getZSortedChildren$annotations", "zSortedChildren", "b0", "isValidOwnerScope", "J", "hasFixedInnerContentConstraints", "l0", "width", "K", "height", "alignmentLinesRequired", "Lgn5;", "V", "()Lgn5;", "mDrawScope", "isPlaced", "i0", "placeOrder", "measuredByParent", "a0", "measuredByParentInLookahead", "L", "innerCoordinator", "f0", "outerCoordinator", "Lom5;", "()Lom5;", MessageAttributes.COORDINATES, "measurePending", "P", "layoutPending", "S", "lookaheadMeasurePending", "R", "lookaheadLayoutPending", "<init>", "(ZI)V", "V4", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: en5 */
/* loaded from: classes.dex */
public final class en5 implements kn1, uc9, vm7, tm5, mn1, um7.b {
    public static final d V4 = new d(null);
    private static final f W4 = new c();
    private static final Function0<en5> X4 = a.a;
    private static final xyb Y4 = new b();
    private static final Comparator<en5> Z4 = new Comparator() { // from class: dn5
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int o;
            o = en5.o((en5) obj, (en5) obj2);
            return o;
        }
    };
    private final mz6 A;
    private final jn5 B;
    private oz6 I;
    private Function1<? super um7, Unit> S4;
    private boolean T4;
    private boolean U4;
    private boolean X;
    private sm6 Y;
    private Function1<? super um7, Unit> Z;
    private final boolean a;
    private int b;
    private int c;
    private boolean d;
    private en5 e;
    private int f;
    private final ir6<en5> g;
    private gr6<en5> h;
    private boolean i;
    private en5 j;
    private um7 k;
    private jj l;
    private int m;
    private boolean n;
    private taa o;
    private final gr6<en5> p;
    private boolean q;
    private qb6 r;
    private final d75 s;
    private a03 t;
    private qm5 u;
    private xyb v;
    private po1 w;
    private g x;
    private g y;
    private boolean z;

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Len5;", "a", "()Len5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: en5$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<en5> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final en5 invoke() {
            return new en5(false, 0, 3, null);
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u001d\u0010\n\u001a\u00020\b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"en5$b", "Lxyb;", "", "b", "()J", "longPressTimeoutMillis", "a", "doubleTapTimeoutMillis", "Ll73;", com.huawei.hms.opendevice.c.a, "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: en5$b */
    /* loaded from: classes.dex */
    public static final class b implements xyb {
        b() {
        }

        @Override // defpackage.xyb
        public long a() {
            return 300L;
        }

        @Override // defpackage.xyb
        public long b() {
            return 400L;
        }

        @Override // defpackage.xyb
        public long c() {
            return l73.a.b();
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"en5$c", "Len5$f;", "Lvb6;", "", "Lmb6;", "measurables", "Lnr1;", "constraints", "", "b", "(Lvb6;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: en5$c */
    /* loaded from: classes.dex */
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // defpackage.qb6
        public /* bridge */ /* synthetic */ tb6 a(vb6 vb6Var, List list, long j) {
            return (tb6) b(vb6Var, list, j);
        }

        public Void b(vb6 vb6Var, List<? extends mb6> list, long j) {
            z65.h(vb6Var, "$this$measure");
            z65.h(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Len5$d;", "", "Lkotlin/Function0;", "Len5;", "Constructor", "Lkotlin/jvm/functions/Function0;", "a", "()Lkotlin/jvm/functions/Function0;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "b", "()Ljava/util/Comparator;", "Len5$f;", "ErrorMeasurePolicy", "Len5$f;", "", "NotPlacedPlaceOrder", "I", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: en5$d */
    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function0<en5> a() {
            return en5.X4;
        }

        public final Comparator<en5> b() {
            return en5.Z4;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Len5$e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: en5$e */
    /* loaded from: classes.dex */
    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Len5$f;", "Lqb6;", "", "a", "Ljava/lang/String;", "error", "<init>", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: en5$f */
    /* loaded from: classes.dex */
    public static abstract class f implements qb6 {
        private final String a;

        public f(String str) {
            z65.h(str, "error");
            this.a = str;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Len5$g;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", com.huawei.hms.opendevice.c.a, "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: en5$g */
    /* loaded from: classes.dex */
    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: en5$h */
    /* loaded from: classes.dex */
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: en5$i */
    /* loaded from: classes.dex */
    public static final class i extends ej5 implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(0);
            en5.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            en5.this.O().J();
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: en5$j */
    /* loaded from: classes.dex */
    public static final class j extends ej5 implements Function0<Unit> {
        final /* synthetic */ ea9<taa> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ea9<taa> ea9Var) {
            super(0);
            en5.this = r1;
            this.b = ea9Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r6v7, types: [T, taa] */
        /* renamed from: invoke */
        public final void invoke2() {
            int i;
            mz6 e0 = en5.this.e0();
            int a = qz6.a(8);
            ea9<taa> ea9Var = this.b;
            i = e0.i();
            if ((i & a) != 0) {
                for (sm6.c o = e0.o(); o != null; o = o.J0()) {
                    if ((o.H0() & a) != 0) {
                        sm6.c cVar = o;
                        gr6 gr6Var = null;
                        while (cVar != null) {
                            if (cVar instanceof yaa) {
                                yaa yaaVar = (yaa) cVar;
                                if (yaaVar.x()) {
                                    ?? taaVar = new taa();
                                    ea9Var.a = taaVar;
                                    taaVar.A(true);
                                }
                                if (yaaVar.y0()) {
                                    ea9Var.a.B(true);
                                }
                                yaaVar.U(ea9Var.a);
                            } else if ((cVar.H0() & a) != 0 && (cVar instanceof fu2)) {
                                int i2 = 0;
                                for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                    if ((g1.H0() & a) != 0) {
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
            }
        }
    }

    public en5() {
        this(false, 0, 3, null);
    }

    private final void B0() {
        en5 en5Var;
        if (this.f > 0) {
            this.i = true;
        }
        if (this.a && (en5Var = this.j) != null) {
            en5Var.B0();
        }
    }

    public static /* synthetic */ boolean G0(en5 en5Var, nr1 nr1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nr1Var = en5Var.B.w();
        }
        return en5Var.F0(nr1Var);
    }

    private final oz6 M() {
        sm7 sm7Var;
        if (this.X) {
            oz6 L = L();
            oz6 B1 = f0().B1();
            this.I = null;
            while (true) {
                if (z65.c(L, B1)) {
                    break;
                }
                if (L != null) {
                    sm7Var = L.u1();
                } else {
                    sm7Var = null;
                }
                if (sm7Var != null) {
                    this.I = L;
                    break;
                } else if (L != null) {
                    L = L.B1();
                } else {
                    L = null;
                }
            }
        }
        oz6 oz6Var = this.I;
        if (oz6Var != null && oz6Var.u1() == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return oz6Var;
    }

    private final void N0(en5 en5Var) {
        jn5 jn5Var;
        if (en5Var.B.r() > 0) {
            this.B.S(jn5Var.r() - 1);
        }
        if (this.k != null) {
            en5Var.x();
        }
        en5Var.j = null;
        en5Var.f0().e2(null);
        if (en5Var.a) {
            this.f--;
            gr6<en5> e2 = en5Var.g.e();
            int s = e2.s();
            if (s > 0) {
                en5[] r = e2.r();
                int i2 = 0;
                do {
                    r[i2].f0().e2(null);
                    i2++;
                } while (i2 < s);
            }
        }
        B0();
        P0();
    }

    private final void O0() {
        y0();
        en5 h0 = h0();
        if (h0 != null) {
            h0.w0();
        }
        x0();
    }

    private final void R0() {
        if (this.i) {
            int i2 = 0;
            this.i = false;
            gr6<en5> gr6Var = this.h;
            if (gr6Var == null) {
                gr6Var = new gr6<>(new en5[16], 0);
                this.h = gr6Var;
            }
            gr6Var.k();
            gr6<en5> e2 = this.g.e();
            int s = e2.s();
            if (s > 0) {
                en5[] r = e2.r();
                do {
                    en5 en5Var = r[i2];
                    if (en5Var.a) {
                        gr6Var.d(gr6Var.s(), en5Var.o0());
                    } else {
                        gr6Var.b(en5Var);
                    }
                    i2++;
                } while (i2 < s);
                this.B.J();
            }
            this.B.J();
        }
    }

    public static /* synthetic */ boolean T0(en5 en5Var, nr1 nr1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nr1Var = en5Var.B.v();
        }
        return en5Var.S0(nr1Var);
    }

    public static /* synthetic */ void Y0(en5 en5Var, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        en5Var.X0(z);
    }

    public static /* synthetic */ void a1(en5 en5Var, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        en5Var.Z0(z, z2);
    }

    public static /* synthetic */ void c1(en5 en5Var, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        en5Var.b1(z);
    }

    public static /* synthetic */ void e1(en5 en5Var, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        en5Var.d1(z, z2);
    }

    private final void g1() {
        this.A.x();
    }

    private final void k1(en5 en5Var) {
        if (!z65.c(en5Var, this.e)) {
            this.e = en5Var;
            if (en5Var != null) {
                this.B.p();
                oz6 A1 = L().A1();
                for (oz6 f0 = f0(); !z65.c(f0, A1) && f0 != null; f0 = f0.A1()) {
                    f0.n1();
                }
            }
            y0();
        }
    }

    private final float m0() {
        return W().P0();
    }

    public static final int o(en5 en5Var, en5 en5Var2) {
        if (en5Var.m0() == en5Var2.m0()) {
            return z65.j(en5Var.i0(), en5Var2.i0());
        }
        return Float.compare(en5Var.m0(), en5Var2.m0());
    }

    public static /* synthetic */ void q0(en5 en5Var, long j2, qo4 qo4Var, boolean z, boolean z2, int i2, Object obj) {
        boolean z3;
        boolean z4;
        if ((i2 & 4) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i2 & 8) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        en5Var.p0(j2, qo4Var, z3, z4);
    }

    public static /* synthetic */ void s0(en5 en5Var, long j2, qo4 qo4Var, boolean z, boolean z2, int i2, Object obj) {
        boolean z3;
        boolean z4;
        if ((i2 & 4) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i2 & 8) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        en5Var.r0(j2, qo4Var, z3, z4);
    }

    private final void u() {
        this.y = this.x;
        this.x = g.NotUsed;
        gr6<en5> o0 = o0();
        int s = o0.s();
        if (s > 0) {
            en5[] r = o0.r();
            int i2 = 0;
            do {
                en5 en5Var = r[i2];
                if (en5Var.x == g.InLayoutBlock) {
                    en5Var.u();
                }
                i2++;
            } while (i2 < s);
        }
    }

    private final void u0() {
        boolean z;
        boolean z2;
        if (this.A.p(qz6.a(1024) | qz6.a(2048) | qz6.a(4096))) {
            for (sm6.c k = this.A.k(); k != null; k = k.D0()) {
                boolean z3 = false;
                if ((qz6.a(1024) & k.H0()) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((qz6.a(2048) & k.H0()) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                if ((qz6.a(4096) & k.H0()) != 0) {
                    z3 = true;
                }
                if (z4 | z3) {
                    rz6.a(k);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String v(int r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            if (r2 >= r8) goto L11
            java.lang.String r3 = "  "
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L11:
            java.lang.String r2 = "|-"
            r0.append(r2)
            java.lang.String r2 = r7.toString()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            gr6 r2 = r7.o0()
            int r3 = r2.s()
            if (r3 <= 0) goto L42
            java.lang.Object[] r2 = r2.r()
            r4 = 0
        L31:
            r5 = r2[r4]
            en5 r5 = (defpackage.en5) r5
            int r6 = r8 + 1
            java.lang.String r5 = r5.v(r6)
            r0.append(r5)
            int r4 = r4 + 1
            if (r4 < r3) goto L31
        L42:
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "tree.toString()"
            defpackage.z65.g(r0, r2)
            if (r8 != 0) goto L5c
            int r8 = r0.length()
            int r8 = r8 + (-1)
            java.lang.String r0 = r0.substring(r1, r8)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            defpackage.z65.g(r0, r8)
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en5.v(int):java.lang.String");
    }

    private final void v0() {
        int i2;
        mz6 mz6Var = this.A;
        int a2 = qz6.a(1024);
        i2 = mz6Var.i();
        if ((i2 & a2) != 0) {
            for (sm6.c o = mz6Var.o(); o != null; o = o.J0()) {
                if ((o.H0() & a2) != 0) {
                    sm6.c cVar = o;
                    gr6 gr6Var = null;
                    while (cVar != null) {
                        if (cVar instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                            if (focusTargetNode.l1().a()) {
                                in5.b(this).getFocusOwner().c(true, false);
                                focusTargetNode.n1();
                            }
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
            }
        }
    }

    static /* synthetic */ String w(en5 en5Var, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return en5Var.v(i2);
    }

    public final boolean A() {
        jb d2;
        jn5 jn5Var = this.B;
        if (jn5Var.q().d().k()) {
            return true;
        }
        kb z = jn5Var.z();
        if (z != null && (d2 = z.d()) != null && d2.k()) {
            return true;
        }
        return false;
    }

    public final void A0() {
        this.o = null;
        in5.b(this).p();
    }

    public final boolean B() {
        return this.z;
    }

    public final List<mb6> C() {
        jn5.a T = T();
        z65.e(T);
        return T.K0();
    }

    public boolean C0() {
        if (this.k != null) {
            return true;
        }
        return false;
    }

    public final List<mb6> D() {
        return W().K0();
    }

    public final Boolean D0() {
        jn5.a T = T();
        if (T != null) {
            return Boolean.valueOf(T.b());
        }
        return null;
    }

    public final List<en5> E() {
        return o0().h();
    }

    public final boolean E0() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, taa] */
    public final taa F() {
        if (this.A.q(qz6.a(8)) && this.o == null) {
            ea9 ea9Var = new ea9();
            ea9Var.a = new taa();
            in5.b(this).getSnapshotObserver().i(this, new j(ea9Var));
            T t = ea9Var.a;
            this.o = (taa) t;
            return (taa) t;
        }
        return this.o;
    }

    public final boolean F0(nr1 nr1Var) {
        if (nr1Var != null && this.e != null) {
            jn5.a T = T();
            z65.e(T);
            return T.X0(nr1Var.s());
        }
        return false;
    }

    public po1 G() {
        return this.w;
    }

    public a03 H() {
        return this.t;
    }

    public final void H0() {
        if (this.x == g.NotUsed) {
            u();
        }
        jn5.a T = T();
        z65.e(T);
        T.Y0();
    }

    public final int I() {
        return this.m;
    }

    public final void I0() {
        this.B.K();
    }

    public final boolean J() {
        long t1 = L().t1();
        if (nr1.l(t1) && nr1.k(t1)) {
            return true;
        }
        return false;
    }

    public final void J0() {
        this.B.L();
    }

    public int K() {
        return this.B.u();
    }

    public final void K0() {
        this.B.M();
    }

    public final oz6 L() {
        return this.A.l();
    }

    public final void L0() {
        this.B.N();
    }

    public final void M0(int i2, int i3, int i4) {
        int i5;
        if (i2 == i3) {
            return;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            if (i2 > i3) {
                i5 = i2 + i6;
            } else {
                i5 = i2;
            }
            this.g.a(i2 > i3 ? i3 + i6 : (i3 + i4) - 2, this.g.f(i5));
        }
        P0();
        B0();
        y0();
    }

    public final g N() {
        return this.x;
    }

    public final jn5 O() {
        return this.B;
    }

    public final boolean P() {
        return this.B.x();
    }

    public final void P0() {
        if (this.a) {
            en5 h0 = h0();
            if (h0 != null) {
                h0.P0();
                return;
            }
            return;
        }
        this.q = true;
    }

    public final e Q() {
        return this.B.y();
    }

    public final void Q0(int i2, int i3) {
        oz6 oz6Var;
        om5 om5Var;
        int l;
        qm5 k;
        jn5 jn5Var;
        boolean A;
        if (this.x == g.NotUsed) {
            u();
        }
        jn5.b W = W();
        gb8.a.C0324a c0324a = gb8.a.a;
        int v0 = W.v0();
        qm5 layoutDirection = getLayoutDirection();
        en5 h0 = h0();
        if (h0 != null) {
            oz6Var = h0.L();
        } else {
            oz6Var = null;
        }
        oz6 oz6Var2 = oz6Var;
        om5Var = gb8.a.d;
        l = c0324a.l();
        k = c0324a.k();
        jn5Var = gb8.a.e;
        gb8.a.c = v0;
        gb8.a.b = layoutDirection;
        A = c0324a.A(oz6Var2);
        gb8.a.r(c0324a, W, i2, i3, 0.0f, 4, null);
        if (oz6Var2 != null) {
            oz6Var2.T0(A);
        }
        gb8.a.c = l;
        gb8.a.b = k;
        gb8.a.d = om5Var;
        gb8.a.e = jn5Var;
    }

    public final boolean R() {
        return this.B.A();
    }

    public final boolean S() {
        return this.B.B();
    }

    public final boolean S0(nr1 nr1Var) {
        if (nr1Var != null) {
            if (this.x == g.NotUsed) {
                t();
            }
            return W().Z0(nr1Var.s());
        }
        return false;
    }

    public final jn5.a T() {
        return this.B.C();
    }

    public final en5 U() {
        return this.e;
    }

    public final void U0() {
        int d2 = this.g.d();
        while (true) {
            d2--;
            if (-1 < d2) {
                N0(this.g.c(d2));
            } else {
                this.g.b();
                return;
            }
        }
    }

    public final gn5 V() {
        return in5.b(this).getSharedDrawScope();
    }

    public final void V0(int i2, int i3) {
        if (i3 >= 0) {
            int i4 = (i3 + i2) - 1;
            if (i2 > i4) {
                return;
            }
            while (true) {
                N0(this.g.f(i4));
                if (i4 != i2) {
                    i4--;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i3 + ") must be greater than 0").toString());
        }
    }

    public final jn5.b W() {
        return this.B.D();
    }

    public final void W0() {
        if (this.x == g.NotUsed) {
            u();
        }
        W().a1();
    }

    public final boolean X() {
        return this.B.E();
    }

    public final void X0(boolean z) {
        um7 um7Var;
        if (!this.a && (um7Var = this.k) != null) {
            um7Var.k(this, true, z);
        }
    }

    public qb6 Y() {
        return this.r;
    }

    public final g Z() {
        return W().N0();
    }

    public final void Z0(boolean z, boolean z2) {
        if (this.e != null) {
            um7 um7Var = this.k;
            if (um7Var != null && !this.n && !this.a) {
                um7Var.q(this, true, z, z2);
                jn5.a T = T();
                z65.e(T);
                T.P0(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    @Override // defpackage.mn1
    public void a(qm5 qm5Var) {
        z65.h(qm5Var, "value");
        if (this.u != qm5Var) {
            this.u = qm5Var;
            O0();
        }
    }

    public final g a0() {
        g O0;
        jn5.a T = T();
        if (T == null || (O0 = T.O0()) == null) {
            return g.NotUsed;
        }
        return O0;
    }

    @Override // defpackage.tm5
    public boolean b() {
        return W().b();
    }

    @Override // defpackage.vm7
    public boolean b0() {
        return C0();
    }

    public final void b1(boolean z) {
        um7 um7Var;
        if (!this.a && (um7Var = this.k) != null) {
            tm7.d(um7Var, this, false, z, 2, null);
        }
    }

    @Override // defpackage.mn1
    public void c(int i2) {
        this.c = i2;
    }

    public sm6 c0() {
        return this.Y;
    }

    @Override // defpackage.kn1
    public void d() {
        jj jjVar = this.l;
        if (jjVar != null) {
            jjVar.d();
        }
        this.U4 = true;
        g1();
    }

    public final boolean d0() {
        return this.T4;
    }

    public final void d1(boolean z, boolean z2) {
        um7 um7Var;
        if (this.n || this.a || (um7Var = this.k) == null) {
            return;
        }
        tm7.c(um7Var, this, false, z, z2, 2, null);
        W().Q0(z);
    }

    @Override // defpackage.kn1
    public void e() {
        if (C0()) {
            jj jjVar = this.l;
            if (jjVar != null) {
                jjVar.e();
            }
            if (this.U4) {
                this.U4 = false;
            } else {
                g1();
            }
            m1(waa.a());
            this.A.s();
            this.A.y();
            return;
        }
        throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
    }

    public final mz6 e0() {
        return this.A;
    }

    @Override // defpackage.mn1
    public void f(a03 a03Var) {
        int i2;
        z65.h(a03Var, "value");
        if (!z65.c(this.t, a03Var)) {
            this.t = a03Var;
            O0();
            mz6 mz6Var = this.A;
            int a2 = qz6.a(16);
            i2 = mz6Var.i();
            if ((i2 & a2) != 0) {
                for (sm6.c k = mz6Var.k(); k != null; k = k.D0()) {
                    if ((k.H0() & a2) != 0) {
                        sm6.c cVar = k;
                        gr6 gr6Var = null;
                        while (cVar != null) {
                            if (cVar instanceof fe8) {
                                ((fe8) cVar).j0();
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
                    if ((k.C0() & a2) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final oz6 f0() {
        return this.A.n();
    }

    public final void f1(en5 en5Var) {
        z65.h(en5Var, "it");
        if (h.$EnumSwitchMapping$0[en5Var.Q().ordinal()] == 1) {
            if (en5Var.X()) {
                e1(en5Var, true, false, 2, null);
                return;
            } else if (en5Var.P()) {
                en5Var.b1(true);
                return;
            } else if (en5Var.S()) {
                a1(en5Var, true, false, 2, null);
                return;
            } else if (en5Var.R()) {
                en5Var.X0(true);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + en5Var.Q());
    }

    @Override // defpackage.um7.b
    public void g() {
        oz6 L = L();
        int a2 = qz6.a(128);
        boolean i2 = rz6.i(a2);
        sm6.c z1 = L.z1();
        if (i2 || (z1 = z1.J0()) != null) {
            for (sm6.c F1 = L.F1(i2); F1 != null && (F1.C0() & a2) != 0; F1 = F1.D0()) {
                if ((F1.H0() & a2) != 0) {
                    sm6.c cVar = F1;
                    gr6 gr6Var = null;
                    while (cVar != null) {
                        if (cVar instanceof km5) {
                            ((km5) cVar).m(L());
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

    public final um7 g0() {
        return this.k;
    }

    @Override // defpackage.tm5
    public qm5 getLayoutDirection() {
        return this.u;
    }

    @Override // defpackage.mn1
    public void h(qb6 qb6Var) {
        z65.h(qb6Var, "value");
        if (!z65.c(this.r, qb6Var)) {
            this.r = qb6Var;
            this.s.b(Y());
            y0();
        }
    }

    public final en5 h0() {
        en5 en5Var = this.j;
        while (en5Var != null && en5Var.a) {
            en5Var = en5Var.j;
        }
        return en5Var;
    }

    public final void h1() {
        gr6<en5> o0 = o0();
        int s = o0.s();
        if (s > 0) {
            en5[] r = o0.r();
            int i2 = 0;
            do {
                en5 en5Var = r[i2];
                g gVar = en5Var.y;
                en5Var.x = gVar;
                if (gVar != g.NotUsed) {
                    en5Var.h1();
                }
                i2++;
            } while (i2 < s);
        }
    }

    @Override // defpackage.kn1
    public void i() {
        jj jjVar = this.l;
        if (jjVar != null) {
            jjVar.i();
        }
        oz6 A1 = L().A1();
        for (oz6 f0 = f0(); !z65.c(f0, A1) && f0 != null; f0 = f0.A1()) {
            f0.V1();
        }
    }

    public final int i0() {
        return W().O0();
    }

    public final void i1(boolean z) {
        this.z = z;
    }

    @Override // defpackage.tm5
    public om5 j() {
        return L();
    }

    public int j0() {
        return this.b;
    }

    public final void j1(boolean z) {
        this.X = z;
    }

    @Override // defpackage.mn1
    public void k(po1 po1Var) {
        int i2;
        z65.h(po1Var, "value");
        this.w = po1Var;
        f((a03) po1Var.b(ro1.c()));
        a((qm5) po1Var.b(ro1.f()));
        m((xyb) po1Var.b(ro1.h()));
        mz6 mz6Var = this.A;
        int a2 = qz6.a(32768);
        i2 = mz6Var.i();
        if ((i2 & a2) != 0) {
            for (sm6.c k = mz6Var.k(); k != null; k = k.D0()) {
                if ((k.H0() & a2) != 0) {
                    sm6.c cVar = k;
                    gr6 gr6Var = null;
                    while (cVar != null) {
                        if (cVar instanceof mo1) {
                            sm6.c I = ((mo1) cVar).I();
                            if (I.M0()) {
                                rz6.e(I);
                            } else {
                                I.c1(true);
                            }
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
                if ((k.C0() & a2) == 0) {
                    return;
                }
            }
        }
    }

    public xyb k0() {
        return this.v;
    }

    @Override // defpackage.mn1
    public void l(sm6 sm6Var) {
        z65.h(sm6Var, "value");
        if (this.a && c0() != sm6.a) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.Y = sm6Var;
        this.A.E(sm6Var);
        this.B.V();
        if (this.A.q(qz6.a(512)) && this.e == null) {
            k1(this);
        }
    }

    public int l0() {
        return this.B.G();
    }

    public final void l1(boolean z) {
        this.T4 = z;
    }

    @Override // defpackage.mn1
    public void m(xyb xybVar) {
        int i2;
        z65.h(xybVar, "value");
        if (!z65.c(this.v, xybVar)) {
            this.v = xybVar;
            mz6 mz6Var = this.A;
            int a2 = qz6.a(16);
            i2 = mz6Var.i();
            if ((i2 & a2) != 0) {
                for (sm6.c k = mz6Var.k(); k != null; k = k.D0()) {
                    if ((k.H0() & a2) != 0) {
                        sm6.c cVar = k;
                        gr6 gr6Var = null;
                        while (cVar != null) {
                            if (cVar instanceof fe8) {
                                ((fe8) cVar).x0();
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
                    if ((k.C0() & a2) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public void m1(int i2) {
        this.b = i2;
    }

    public final gr6<en5> n0() {
        if (this.q) {
            this.p.k();
            gr6<en5> gr6Var = this.p;
            gr6Var.d(gr6Var.s(), o0());
            this.p.D(Z4);
            this.q = false;
        }
        return this.p;
    }

    public final void n1() {
        if (this.f > 0) {
            R0();
        }
    }

    public final gr6<en5> o0() {
        n1();
        if (this.f == 0) {
            return this.g.e();
        }
        gr6<en5> gr6Var = this.h;
        z65.e(gr6Var);
        return gr6Var;
    }

    public final void p0(long j2, qo4 qo4Var, boolean z, boolean z2) {
        z65.h(qo4Var, "hitTestResult");
        f0().I1(oz6.z.a(), f0().p1(j2), qo4Var, z, z2);
    }

    public final void r0(long j2, qo4 qo4Var, boolean z, boolean z2) {
        z65.h(qo4Var, "hitSemanticsEntities");
        f0().I1(oz6.z.b(), f0().p1(j2), qo4Var, true, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.um7 r7) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en5.s(um7):void");
    }

    public final void t() {
        this.y = this.x;
        this.x = g.NotUsed;
        gr6<en5> o0 = o0();
        int s = o0.s();
        if (s > 0) {
            en5[] r = o0.r();
            int i2 = 0;
            do {
                en5 en5Var = r[i2];
                if (en5Var.x != g.NotUsed) {
                    en5Var.t();
                }
                i2++;
            } while (i2 < s);
        }
    }

    public final void t0(int i2, en5 en5Var) {
        z65.h(en5Var, "instance");
        String str = null;
        if (en5Var.j == null) {
            if (en5Var.k == null) {
                en5Var.j = this;
                this.g.a(i2, en5Var);
                P0();
                if (en5Var.a) {
                    this.f++;
                }
                B0();
                um7 um7Var = this.k;
                if (um7Var != null) {
                    en5Var.s(um7Var);
                }
                if (en5Var.B.r() > 0) {
                    jn5 jn5Var = this.B;
                    jn5Var.S(jn5Var.r() + 1);
                    return;
                }
                return;
            }
            throw new IllegalStateException(("Cannot insert " + en5Var + " because it already has an owner. This tree: " + w(this, 0, 1, null) + " Other tree: " + w(en5Var, 0, 1, null)).toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot insert ");
        sb.append(en5Var);
        sb.append(" because it already has a parent. This tree: ");
        sb.append(w(this, 0, 1, null));
        sb.append(" Other tree: ");
        en5 en5Var2 = en5Var.j;
        if (en5Var2 != null) {
            str = w(en5Var2, 0, 1, null);
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        return fd5.a(this, null) + " children: " + E().size() + " measurePolicy: " + Y();
    }

    public final void w0() {
        oz6 M = M();
        if (M != null) {
            M.K1();
            return;
        }
        en5 h0 = h0();
        if (h0 != null) {
            h0.w0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            r8 = this;
            um7 r0 = r8.k
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L2c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Cannot detach node that is already detached!  Tree: "
            r0.append(r4)
            en5 r4 = r8.h0()
            if (r4 == 0) goto L1b
            java.lang.String r2 = w(r4, r3, r1, r2)
        L1b:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L2c:
            r8.v0()
            en5 r4 = r8.h0()
            if (r4 == 0) goto L4d
            r4.w0()
            r4.y0()
            jn5$b r4 = r8.W()
            en5$g r5 = defpackage.en5.g.NotUsed
            r4.c1(r5)
            jn5$a r4 = r8.T()
            if (r4 == 0) goto L4d
            r4.a1(r5)
        L4d:
            jn5 r4 = r8.B
            r4.R()
            kotlin.jvm.functions.Function1<? super um7, kotlin.Unit> r4 = r8.S4
            if (r4 == 0) goto L59
            r4.invoke(r0)
        L59:
            mz6 r4 = r8.A
            r5 = 8
            int r5 = defpackage.qz6.a(r5)
            boolean r4 = r4.q(r5)
            if (r4 == 0) goto L6a
            r8.A0()
        L6a:
            mz6 r4 = r8.A
            r4.z()
            r(r8, r1)
            ir6<en5> r4 = r8.g
            gr6 r4 = r4.e()
            int r5 = r4.s()
            if (r5 <= 0) goto L8d
            java.lang.Object[] r4 = r4.r()
            r6 = 0
        L83:
            r7 = r4[r6]
            en5 r7 = (defpackage.en5) r7
            r7.x()
            int r6 = r6 + r1
            if (r6 < r5) goto L83
        L8d:
            r(r8, r3)
            mz6 r1 = r8.A
            r1.t()
            r0.j(r8)
            r8.k = r2
            r8.k1(r2)
            r8.m = r3
            jn5$b r0 = r8.W()
            r0.W0()
            jn5$a r0 = r8.T()
            if (r0 == 0) goto Laf
            r0.V0()
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en5.x():void");
    }

    public final void x0() {
        oz6 f0 = f0();
        oz6 L = L();
        while (f0 != L) {
            z65.f(f0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            an5 an5Var = (an5) f0;
            sm7 u1 = an5Var.u1();
            if (u1 != null) {
                u1.invalidate();
            }
            f0 = an5Var.A1();
        }
        sm7 u12 = L().u1();
        if (u12 != null) {
            u12.invalidate();
        }
    }

    public final void y() {
        int i2;
        if (Q() != e.Idle || P() || X() || !b()) {
            return;
        }
        mz6 mz6Var = this.A;
        int a2 = qz6.a(256);
        i2 = mz6Var.i();
        if ((i2 & a2) != 0) {
            for (sm6.c k = mz6Var.k(); k != null; k = k.D0()) {
                if ((k.H0() & a2) != 0) {
                    sm6.c cVar = k;
                    gr6 gr6Var = null;
                    while (cVar != null) {
                        if (cVar instanceof jg4) {
                            jg4 jg4Var = (jg4) cVar;
                            jg4Var.e(au2.h(jg4Var, qz6.a(256)));
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
                if ((k.C0() & a2) == 0) {
                    return;
                }
            }
        }
    }

    public final void y0() {
        if (this.e != null) {
            a1(this, false, false, 3, null);
        } else {
            e1(this, false, false, 3, null);
        }
    }

    public final void z(qn0 qn0Var) {
        z65.h(qn0Var, "canvas");
        f0().k1(qn0Var);
    }

    public final void z0() {
        this.B.H();
    }

    public en5(boolean z, int i2) {
        a03 a03Var;
        this.a = z;
        this.b = i2;
        this.g = new ir6<>(new gr6(new en5[16], 0), new i());
        this.p = new gr6<>(new en5[16], 0);
        this.q = true;
        this.r = W4;
        this.s = new d75(this);
        a03Var = in5.a;
        this.t = a03Var;
        this.u = qm5.Ltr;
        this.v = Y4;
        this.w = po1.H.a();
        g gVar = g.NotUsed;
        this.x = gVar;
        this.y = gVar;
        this.A = new mz6(this);
        this.B = new jn5(this);
        this.X = true;
        this.Y = sm6.a;
    }

    public /* synthetic */ en5(boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? waa.a() : i2);
    }
}
