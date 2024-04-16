package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.d;
import kotlin.ranges.g;
/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b-\b\u0000\u0018\u0000 K*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002g\u0005B1\u0012\u0006\u0010h\u001a\u00020\u0007\u0012\u0006\u0010i\u001a\u00020\u0007\u0012\u000e\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&\u0012\b\u0010k\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bq\u0010rB)\b\u0016\u0012\u0006\u0010h\u001a\u00020\u0007\u0012\u0006\u0010i\u001a\u00020\u0007\u0012\u000e\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&¢\u0006\u0004\bq\u0010sJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\rJ3\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0017J?\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J8\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J&\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J.\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JQ\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b'\u0010(JK\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010*JS\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010,J]\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u00012\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b3\u00104J&\u00105\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J:\u00106\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002J\u001e\u00108\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u0007H\u0002J2\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00107\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002J\u0017\u0010:\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b<\u0010=J-\u0010>\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b>\u0010?J?\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002¢\u0006\u0004\b@\u0010AJ%\u00107\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b7\u0010BJ9\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002¢\u0006\u0004\bC\u0010DJA\u0010E\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002¢\u0006\u0004\bE\u0010AJ8\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010H\u001a\u00020G2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JT\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018H\u0002J\b\u0010K\u001a\u00020\u0007H\u0002J\u001c\u0010L\u001a\u00020\t2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002JP\u0010N\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002JX\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u000f\u0010O\u001a\u00020\u0007H\u0000¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bU\u0010TJ#\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\bV\u0010WJ%\u0010Y\u001a\u00020\t2\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\bY\u0010ZJ'\u0010[\u001a\u0004\u0018\u00018\u00012\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b[\u0010\\JJ\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010%\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018J;\u0010^\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b^\u0010_JM\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018¢\u0006\u0004\b`\u0010aJ3\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\bb\u0010cJG\u0010d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018¢\u0006\u0004\bd\u0010eJO\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010X\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010%\u001a\u00020\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018¢\u0006\u0004\bf\u0010aR\u0016\u0010h\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u00106R\u0016\u0010i\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0016\u0010k\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010jR4\u0010p\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&2\u000e\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010m\u001a\u0004\bn\u0010o¨\u0006t"}, d2 = {"Lumb;", "K", "V", "", "Lumb$b;", "b", c.a, "", "positionMask", "", "r", "keyIndex", "t", "(I)Ljava/lang/Object;", "W", Action.KEY_ATTRIBUTE, "value", Image.TYPE_SMALL, "(ILjava/lang/Object;Ljava/lang/Object;)Lumb;", "Lhq6;", "owner", "B", "(ILjava/lang/Object;Ljava/lang/Object;Lhq6;)Lumb;", "(ILjava/lang/Object;)Lumb;", "Lfz7;", "mutator", "M", "(ILjava/lang/Object;Lfz7;)Lumb;", "nodeIndex", "newNode", "U", "L", "S", "J", "newKeyHash", "newKey", "newValue", "shift", "", DateTokenConverter.CONVERTER_KEY, "(IIILjava/lang/Object;Ljava/lang/Object;ILhq6;)[Ljava/lang/Object;", "v", "(IIILjava/lang/Object;Ljava/lang/Object;I)Lumb;", "C", "(IIILjava/lang/Object;Ljava/lang/Object;ILhq6;)Lumb;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "u", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILhq6;)Lumb;", "R", "I", "i", "j", "A", "f", "(Ljava/lang/Object;)Z", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", Image.TYPE_HIGH, "(Ljava/lang/Object;Ljava/lang/Object;)Lumb$b;", "w", "(Ljava/lang/Object;Ljava/lang/Object;Lfz7;)Lumb;", "(Ljava/lang/Object;)Lumb;", "y", "(Ljava/lang/Object;Lfz7;)Lumb;", "z", "otherNode", "Lyz2;", "intersectionCounter", "x", "F", e.a, "l", "targetNode", "T", Image.TYPE_MEDIUM, "()I", "q", "(I)Z", "n", "(I)I", "O", "N", "(I)Lumb;", "keyHash", "k", "(ILjava/lang/Object;I)Z", "o", "(ILjava/lang/Object;I)Ljava/lang/Object;", "E", "P", "(ILjava/lang/Object;Ljava/lang/Object;I)Lumb$b;", "D", "(ILjava/lang/Object;Ljava/lang/Object;ILfz7;)Lumb;", "Q", "(ILjava/lang/Object;I)Lumb;", "G", "(ILjava/lang/Object;ILfz7;)Lumb;", "H", "a", "dataMap", "nodeMap", "Lhq6;", "ownedBy", "<set-?>", "[Ljava/lang/Object;", "p", "()[Ljava/lang/Object;", "buffer", "<init>", "(II[Ljava/lang/Object;Lhq6;)V", "(II[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: umb  reason: default package */
/* loaded from: classes.dex */
public final class umb<K, V> {
    public static final a e = new a(null);
    private static final umb f = new umb(0, 0, new Object[0]);
    private int a;
    private int b;
    private final hq6 c;
    private Object[] d;

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lumb$a;", "", "Lumb;", "", "EMPTY", "Lumb;", "a", "()Lumb;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: umb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final umb a() {
            return umb.f;
        }
    }

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lumb$b;", "K", "V", "", "Lumb;", "a", "Lumb;", "()Lumb;", c.a, "(Lumb;)V", "node", "", "b", "I", "()I", "sizeDelta", "<init>", "(Lumb;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: umb$b */
    /* loaded from: classes.dex */
    public static final class b<K, V> {
        private umb<K, V> a;
        private final int b;

        public b(umb<K, V> umbVar, int i) {
            z65.h(umbVar, "node");
            this.a = umbVar;
            this.b = i;
        }

        public final umb<K, V> a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final void c(umb<K, V> umbVar) {
            z65.h(umbVar, "<set-?>");
            this.a = umbVar;
        }
    }

    public umb(int i, int i2, Object[] objArr, hq6 hq6Var) {
        z65.h(objArr, "buffer");
        this.a = i;
        this.b = i2;
        this.c = hq6Var;
        this.d = objArr;
    }

    private final umb<K, V> A(int i, fz7<K, V> fz7Var) {
        fz7Var.n(fz7Var.size() - 1);
        fz7Var.l(W(i));
        if (this.d.length == 2) {
            return null;
        }
        if (this.c == fz7Var.j()) {
            this.d = ymb.b(this.d, i);
            return this;
        }
        return new umb<>(0, 0, ymb.b(this.d, i), fz7Var.j());
    }

    private final umb<K, V> B(int i, K k, V v, hq6 hq6Var) {
        int n = n(i);
        if (this.c == hq6Var) {
            this.d = ymb.a(this.d, n, k, v);
            this.a = i | this.a;
            return this;
        }
        return new umb<>(i | this.a, this.b, ymb.a(this.d, n, k, v), hq6Var);
    }

    private final umb<K, V> C(int i, int i2, int i3, K k, V v, int i4, hq6 hq6Var) {
        if (this.c == hq6Var) {
            this.d = d(i, i2, i3, k, v, i4, hq6Var);
            this.a ^= i2;
            this.b |= i2;
            return this;
        }
        return new umb<>(this.a ^ i2, i2 | this.b, d(i, i2, i3, k, v, i4, hq6Var), hq6Var);
    }

    private final umb<K, V> F(umb<K, V> umbVar, int i, int i2, yz2 yz2Var, fz7<K, V> fz7Var) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (r(i)) {
            umb<K, V> N = N(O(i));
            if (umbVar.r(i)) {
                return N.E(umbVar.N(umbVar.O(i)), i2 + 5, yz2Var, fz7Var);
            }
            if (umbVar.q(i)) {
                int n = umbVar.n(i);
                K t = umbVar.t(n);
                V W = umbVar.W(n);
                int size = fz7Var.size();
                if (t != null) {
                    i6 = t.hashCode();
                } else {
                    i6 = 0;
                }
                umb<K, V> D = N.D(i6, t, W, i2 + 5, fz7Var);
                if (fz7Var.size() == size) {
                    yz2Var.c(yz2Var.a() + 1);
                    return D;
                }
                return D;
            }
            return N;
        } else if (umbVar.r(i)) {
            umb<K, V> N2 = umbVar.N(umbVar.O(i));
            if (q(i)) {
                int n2 = n(i);
                K t2 = t(n2);
                if (t2 != null) {
                    i4 = t2.hashCode();
                } else {
                    i4 = 0;
                }
                int i8 = i2 + 5;
                if (N2.k(i4, t2, i8)) {
                    yz2Var.c(yz2Var.a() + 1);
                } else {
                    V W2 = W(n2);
                    if (t2 != null) {
                        i5 = t2.hashCode();
                    } else {
                        i5 = 0;
                    }
                    return N2.D(i5, t2, W2, i8, fz7Var);
                }
            }
            return N2;
        } else {
            int n3 = n(i);
            K t3 = t(n3);
            V W3 = W(n3);
            int n4 = umbVar.n(i);
            K t4 = umbVar.t(n4);
            V W4 = umbVar.W(n4);
            if (t3 != null) {
                i3 = t3.hashCode();
            } else {
                i3 = 0;
            }
            if (t4 != null) {
                i7 = t4.hashCode();
            }
            return u(i3, t3, W3, i7, t4, W4, i2 + 5, fz7Var.j());
        }
    }

    private final umb<K, V> I(int i, int i2, fz7<K, V> fz7Var) {
        fz7Var.n(fz7Var.size() - 1);
        fz7Var.l(W(i));
        if (this.d.length == 2) {
            return null;
        }
        if (this.c == fz7Var.j()) {
            this.d = ymb.b(this.d, i);
            this.a ^= i2;
            return this;
        }
        return new umb<>(i2 ^ this.a, this.b, ymb.b(this.d, i), fz7Var.j());
    }

    private final umb<K, V> J(int i, int i2, hq6 hq6Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c == hq6Var) {
            this.d = ymb.c(objArr, i);
            this.b ^= i2;
            return this;
        }
        return new umb<>(this.a, i2 ^ this.b, ymb.c(objArr, i), hq6Var);
    }

    private final umb<K, V> K(umb<K, V> umbVar, umb<K, V> umbVar2, int i, int i2, hq6 hq6Var) {
        if (umbVar2 == null) {
            return J(i, i2, hq6Var);
        }
        if (this.c != hq6Var && umbVar == umbVar2) {
            return this;
        }
        return L(i, umbVar2, hq6Var);
    }

    private final umb<K, V> L(int i, umb<K, V> umbVar, hq6 hq6Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && umbVar.d.length == 2 && umbVar.b == 0) {
            umbVar.a = this.b;
            return umbVar;
        } else if (this.c == hq6Var) {
            objArr[i] = umbVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            z65.g(copyOf, "copyOf(this, size)");
            copyOf[i] = umbVar;
            return new umb<>(this.a, this.b, copyOf, hq6Var);
        }
    }

    private final umb<K, V> M(int i, V v, fz7<K, V> fz7Var) {
        if (this.c == fz7Var.j()) {
            this.d[i + 1] = v;
            return this;
        }
        fz7Var.k(fz7Var.h() + 1);
        Object[] objArr = this.d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        z65.g(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new umb<>(this.a, this.b, copyOf, fz7Var.j());
    }

    private final umb<K, V> R(int i, int i2) {
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        return new umb<>(i2 ^ this.a, this.b, ymb.b(objArr, i));
    }

    private final umb<K, V> S(int i, int i2) {
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        return new umb<>(this.a, i2 ^ this.b, ymb.c(objArr, i));
    }

    private final umb<K, V> T(umb<K, V> umbVar, umb<K, V> umbVar2, int i, int i2) {
        if (umbVar2 == null) {
            return S(i, i2);
        }
        if (umbVar != umbVar2) {
            return U(i, i2, umbVar2);
        }
        return this;
    }

    private final umb<K, V> U(int i, int i2, umb<K, V> umbVar) {
        Object[] objArr = umbVar.d;
        if (objArr.length == 2 && umbVar.b == 0) {
            if (this.d.length == 1) {
                umbVar.a = this.b;
                return umbVar;
            }
            return new umb<>(this.a ^ i2, i2 ^ this.b, ymb.e(this.d, i, n(i2), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.d;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        z65.g(copyOf, "copyOf(this, newSize)");
        copyOf[i] = umbVar;
        return new umb<>(this.a, this.b, copyOf);
    }

    private final umb<K, V> V(int i, V v) {
        Object[] objArr = this.d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        z65.g(copyOf, "copyOf(this, size)");
        copyOf[i + 1] = v;
        return new umb<>(this.a, this.b, copyOf);
    }

    private final V W(int i) {
        return (V) this.d[i + 1];
    }

    private final b<K, V> b() {
        return new b<>(this, 1);
    }

    private final b<K, V> c() {
        return new b<>(this, 0);
    }

    private final Object[] d(int i, int i2, int i3, K k, V v, int i4, hq6 hq6Var) {
        int i5;
        K t = t(i);
        if (t != null) {
            i5 = t.hashCode();
        } else {
            i5 = 0;
        }
        umb<K, V> u = u(i5, t, W(i), i3, k, v, i4 + 5, hq6Var);
        return ymb.d(this.d, i, O(i2) + 1, u);
    }

    private final int e() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += N(i).e();
        }
        return bitCount;
    }

    private final boolean f(K k) {
        d p = g.p(g.q(0, this.d.length), 2);
        int h = p.h();
        int k2 = p.k();
        int p2 = p.p();
        if ((p2 > 0 && h <= k2) || (p2 < 0 && k2 <= h)) {
            while (!z65.c(k, this.d[h])) {
                if (h != k2) {
                    h += p2;
                }
            }
            return true;
        }
        return false;
    }

    private final V g(K k) {
        d p = g.p(g.q(0, this.d.length), 2);
        int h = p.h();
        int k2 = p.k();
        int p2 = p.p();
        if ((p2 > 0 && h <= k2) || (p2 < 0 && k2 <= h)) {
            while (!z65.c(k, t(h))) {
                if (h != k2) {
                    h += p2;
                } else {
                    return null;
                }
            }
            return W(h);
        }
        return null;
    }

    private final b<K, V> h(K k, V v) {
        d p = g.p(g.q(0, this.d.length), 2);
        int h = p.h();
        int k2 = p.k();
        int p2 = p.p();
        if ((p2 > 0 && h <= k2) || (p2 < 0 && k2 <= h)) {
            while (!z65.c(k, t(h))) {
                if (h != k2) {
                    h += p2;
                }
            }
            if (v == W(h)) {
                return null;
            }
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            z65.g(copyOf, "copyOf(this, size)");
            copyOf[h + 1] = v;
            return new umb(0, 0, copyOf).c();
        }
        return new umb(0, 0, ymb.a(this.d, 0, k, v)).b();
    }

    private final umb<K, V> i(K k) {
        d p = g.p(g.q(0, this.d.length), 2);
        int h = p.h();
        int k2 = p.k();
        int p2 = p.p();
        if ((p2 > 0 && h <= k2) || (p2 < 0 && k2 <= h)) {
            while (!z65.c(k, t(h))) {
                if (h != k2) {
                    h += p2;
                }
            }
            return j(h);
        }
        return this;
    }

    private final umb<K, V> j(int i) {
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        return new umb<>(0, 0, ymb.b(objArr, i));
    }

    private final boolean l(umb<K, V> umbVar) {
        if (this == umbVar) {
            return true;
        }
        if (this.b != umbVar.b || this.a != umbVar.a) {
            return false;
        }
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.d[i] != umbVar.d[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i) {
        if ((i & this.b) != 0) {
            return true;
        }
        return false;
    }

    private final umb<K, V> s(int i, K k, V v) {
        return new umb<>(i | this.a, this.b, ymb.a(this.d, n(i), k, v));
    }

    private final K t(int i) {
        return (K) this.d[i];
    }

    private final umb<K, V> u(int i, K k, V v, int i2, K k2, V v2, int i3, hq6 hq6Var) {
        if (i3 > 30) {
            return new umb<>(0, 0, new Object[]{k, v, k2, v2}, hq6Var);
        }
        int f2 = ymb.f(i, i3);
        int f3 = ymb.f(i2, i3);
        if (f2 != f3) {
            return new umb<>((1 << f2) | (1 << f3), 0, f2 < f3 ? new Object[]{k, v, k2, v2} : new Object[]{k2, v2, k, v}, hq6Var);
        }
        return new umb<>(0, 1 << f2, new Object[]{u(i, k, v, i2, k2, v2, i3 + 5, hq6Var)}, hq6Var);
    }

    private final umb<K, V> v(int i, int i2, int i3, K k, V v, int i4) {
        return new umb<>(this.a ^ i2, i2 | this.b, d(i, i2, i3, k, v, i4, null));
    }

    private final umb<K, V> w(K k, V v, fz7<K, V> fz7Var) {
        d p = g.p(g.q(0, this.d.length), 2);
        int h = p.h();
        int k2 = p.k();
        int p2 = p.p();
        if ((p2 > 0 && h <= k2) || (p2 < 0 && k2 <= h)) {
            while (!z65.c(k, t(h))) {
                if (h != k2) {
                    h += p2;
                }
            }
            fz7Var.l(W(h));
            if (this.c == fz7Var.j()) {
                this.d[h + 1] = v;
                return this;
            }
            fz7Var.k(fz7Var.h() + 1);
            Object[] objArr = this.d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            z65.g(copyOf, "copyOf(this, size)");
            copyOf[h + 1] = v;
            return new umb<>(0, 0, copyOf, fz7Var.j());
        }
        fz7Var.n(fz7Var.size() + 1);
        return new umb<>(0, 0, ymb.a(this.d, 0, k, v), fz7Var.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final umb<K, V> x(umb<K, V> umbVar, yz2 yz2Var, hq6 hq6Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.b == 0) {
            z = true;
        } else {
            z = false;
        }
        uj1.a(z);
        if (this.a == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        uj1.a(z2);
        if (umbVar.b == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        uj1.a(z3);
        if (umbVar.a == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        uj1.a(z4);
        Object[] objArr = this.d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + umbVar.d.length);
        z65.g(copyOf, "copyOf(this, newSize)");
        int length = this.d.length;
        d p = g.p(g.q(0, umbVar.d.length), 2);
        int h = p.h();
        int k = p.k();
        int p2 = p.p();
        if ((p2 > 0 && h <= k) || (p2 < 0 && k <= h)) {
            while (true) {
                if (!f(umbVar.d[h])) {
                    Object[] objArr2 = umbVar.d;
                    copyOf[length] = objArr2[h];
                    copyOf[length + 1] = objArr2[h + 1];
                    length += 2;
                } else {
                    yz2Var.c(yz2Var.a() + 1);
                }
                if (h == k) {
                    break;
                }
                h += p2;
            }
        }
        if (length == this.d.length) {
            return this;
        }
        if (length != umbVar.d.length) {
            if (length == copyOf.length) {
                return new umb<>(0, 0, copyOf, hq6Var);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            z65.g(copyOf2, "copyOf(this, newSize)");
            return new umb<>(0, 0, copyOf2, hq6Var);
        }
        return umbVar;
    }

    private final umb<K, V> y(K k, fz7<K, V> fz7Var) {
        d p = g.p(g.q(0, this.d.length), 2);
        int h = p.h();
        int k2 = p.k();
        int p2 = p.p();
        if ((p2 > 0 && h <= k2) || (p2 < 0 && k2 <= h)) {
            while (!z65.c(k, t(h))) {
                if (h != k2) {
                    h += p2;
                }
            }
            return A(h, fz7Var);
        }
        return this;
    }

    private final umb<K, V> z(K k, V v, fz7<K, V> fz7Var) {
        d p = g.p(g.q(0, this.d.length), 2);
        int h = p.h();
        int k2 = p.k();
        int p2 = p.p();
        if ((p2 > 0 && h <= k2) || (p2 < 0 && k2 <= h)) {
            while (true) {
                if (z65.c(k, t(h)) && z65.c(v, W(h))) {
                    return A(h, fz7Var);
                }
                if (h == k2) {
                    break;
                }
                h += p2;
            }
        }
        return this;
    }

    public final umb<K, V> D(int i, K k, V v, int i2, fz7<K, V> fz7Var) {
        umb<K, V> D;
        z65.h(fz7Var, "mutator");
        int f2 = 1 << ymb.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (z65.c(k, t(n))) {
                fz7Var.l(W(n));
                if (W(n) == v) {
                    return this;
                }
                return M(n, v, fz7Var);
            }
            fz7Var.n(fz7Var.size() + 1);
            return C(n, f2, i, k, v, i2, fz7Var.j());
        } else if (r(f2)) {
            int O = O(f2);
            umb<K, V> N = N(O);
            if (i2 == 30) {
                D = N.w(k, v, fz7Var);
            } else {
                D = N.D(i, k, v, i2 + 5, fz7Var);
            }
            if (N == D) {
                return this;
            }
            return L(O, D, fz7Var.j());
        } else {
            fz7Var.n(fz7Var.size() + 1);
            return B(f2, k, v, fz7Var.j());
        }
    }

    public final umb<K, V> E(umb<K, V> umbVar, int i, yz2 yz2Var, fz7<K, V> fz7Var) {
        umb<K, V> umbVar2;
        z65.h(umbVar, "otherNode");
        z65.h(yz2Var, "intersectionCounter");
        z65.h(fz7Var, "mutator");
        if (this == umbVar) {
            yz2Var.b(e());
            return this;
        } else if (i > 30) {
            return x(umbVar, yz2Var, fz7Var.j());
        } else {
            int i2 = this.b | umbVar.b;
            int i3 = this.a;
            int i4 = umbVar.a;
            int i5 = i3 & i4;
            int i6 = (i3 ^ i4) & (~i2);
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                if (z65.c(t(n(lowestOneBit)), umbVar.t(umbVar.n(lowestOneBit)))) {
                    i6 |= lowestOneBit;
                } else {
                    i2 |= lowestOneBit;
                }
                i5 ^= lowestOneBit;
            }
            if ((i2 & i6) == 0) {
                if (z65.c(this.c, fz7Var.j()) && this.a == i6 && this.b == i2) {
                    umbVar2 = this;
                } else {
                    umbVar2 = new umb<>(i6, i2, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i2)]);
                }
                int i7 = 0;
                int i8 = i2;
                int i9 = 0;
                while (i8 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i8);
                    Object[] objArr = umbVar2.d;
                    objArr[(objArr.length - 1) - i9] = F(umbVar, lowestOneBit2, i, yz2Var, fz7Var);
                    i9++;
                    i8 ^= lowestOneBit2;
                }
                while (i6 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i6);
                    int i10 = i7 * 2;
                    if (!umbVar.q(lowestOneBit3)) {
                        int n = n(lowestOneBit3);
                        umbVar2.d[i10] = t(n);
                        umbVar2.d[i10 + 1] = W(n);
                    } else {
                        int n2 = umbVar.n(lowestOneBit3);
                        umbVar2.d[i10] = umbVar.t(n2);
                        umbVar2.d[i10 + 1] = umbVar.W(n2);
                        if (q(lowestOneBit3)) {
                            yz2Var.c(yz2Var.a() + 1);
                        }
                    }
                    i7++;
                    i6 ^= lowestOneBit3;
                }
                if (l(umbVar2)) {
                    return this;
                }
                if (umbVar.l(umbVar2)) {
                    return umbVar;
                }
                return umbVar2;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final umb<K, V> G(int i, K k, int i2, fz7<K, V> fz7Var) {
        umb<K, V> G;
        z65.h(fz7Var, "mutator");
        int f2 = 1 << ymb.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (z65.c(k, t(n))) {
                return I(n, f2, fz7Var);
            }
            return this;
        } else if (r(f2)) {
            int O = O(f2);
            umb<K, V> N = N(O);
            if (i2 == 30) {
                G = N.y(k, fz7Var);
            } else {
                G = N.G(i, k, i2 + 5, fz7Var);
            }
            return K(N, G, O, f2, fz7Var.j());
        } else {
            return this;
        }
    }

    public final umb<K, V> H(int i, K k, V v, int i2, fz7<K, V> fz7Var) {
        umb<K, V> H;
        z65.h(fz7Var, "mutator");
        int f2 = 1 << ymb.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (!z65.c(k, t(n)) || !z65.c(v, W(n))) {
                return this;
            }
            return I(n, f2, fz7Var);
        } else if (!r(f2)) {
            return this;
        } else {
            int O = O(f2);
            umb<K, V> N = N(O);
            if (i2 == 30) {
                H = N.z(k, v, fz7Var);
            } else {
                H = N.H(i, k, v, i2 + 5, fz7Var);
            }
            return K(N, H, O, f2, fz7Var.j());
        }
    }

    public final umb<K, V> N(int i) {
        Object obj = this.d[i];
        z65.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (umb) obj;
    }

    public final int O(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    public final b<K, V> P(int i, K k, V v, int i2) {
        b<K, V> P;
        int f2 = 1 << ymb.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (z65.c(k, t(n))) {
                if (W(n) == v) {
                    return null;
                }
                return V(n, v).c();
            }
            return v(n, f2, i, k, v, i2).b();
        } else if (r(f2)) {
            int O = O(f2);
            umb<K, V> N = N(O);
            if (i2 == 30) {
                P = N.h(k, v);
                if (P == null) {
                    return null;
                }
            } else {
                P = N.P(i, k, v, i2 + 5);
                if (P == null) {
                    return null;
                }
            }
            P.c(U(O, f2, P.a()));
            return P;
        } else {
            return s(f2, k, v).b();
        }
    }

    public final umb<K, V> Q(int i, K k, int i2) {
        umb<K, V> Q;
        int f2 = 1 << ymb.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (z65.c(k, t(n))) {
                return R(n, f2);
            }
            return this;
        } else if (r(f2)) {
            int O = O(f2);
            umb<K, V> N = N(O);
            if (i2 == 30) {
                Q = N.i(k);
            } else {
                Q = N.Q(i, k, i2 + 5);
            }
            return T(N, Q, O, f2);
        } else {
            return this;
        }
    }

    public final boolean k(int i, K k, int i2) {
        int f2 = 1 << ymb.f(i, i2);
        if (q(f2)) {
            return z65.c(k, t(n(f2)));
        }
        if (r(f2)) {
            umb<K, V> N = N(O(f2));
            if (i2 == 30) {
                return N.f(k);
            }
            return N.k(i, k, i2 + 5);
        }
        return false;
    }

    public final int m() {
        return Integer.bitCount(this.a);
    }

    public final int n(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final V o(int i, K k, int i2) {
        int f2 = 1 << ymb.f(i, i2);
        if (q(f2)) {
            int n = n(f2);
            if (!z65.c(k, t(n))) {
                return null;
            }
            return W(n);
        } else if (!r(f2)) {
            return null;
        } else {
            umb<K, V> N = N(O(f2));
            if (i2 == 30) {
                return N.g(k);
            }
            return N.o(i, k, i2 + 5);
        }
    }

    public final Object[] p() {
        return this.d;
    }

    public final boolean q(int i) {
        if ((i & this.a) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public umb(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
        z65.h(objArr, "buffer");
    }
}
