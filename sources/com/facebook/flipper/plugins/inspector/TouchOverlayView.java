package com.facebook.flipper.plugins.inspector;

import android.content.Context;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.flipper.core.ErrorReportingRunnable;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.facebook.flipper.plugins.inspector.descriptors.utils.AccessibilityUtil;
import im.threads.business.transport.MessageAttributes;
import java.util.Iterator;
import java.util.Stack;
/* loaded from: classes2.dex */
abstract class TouchOverlayView extends View implements HiddenNode {
    private final ApplicationWrapper mApplication;
    private final FlipperConnection mConnection;

    public TouchOverlayView(Context context, FlipperConnection flipperConnection, ApplicationWrapper applicationWrapper) {
        super(context);
        this.mConnection = flipperConnection;
        this.mApplication = applicationWrapper;
        setBackgroundColor(BoundsDrawable.COLOR_HIGHLIGHT_CONTENT);
    }

    private Pair<Touch, Stack<FlipperObject.Builder>> createTouch(int i, int i2, boolean z) throws Exception {
        Stack stack = new Stack();
        stack.push(new FlipperObject.Builder());
        Stack stack2 = new Stack();
        stack2.push(this.mApplication);
        return new Pair<>(new AnonymousClass2(i, i2, stack2, z, stack), stack);
    }

    private FlipperArray getPathFromTree(FlipperObject flipperObject) {
        FlipperArray.Builder builder = new FlipperArray.Builder();
        Iterator<String> keys = flipperObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            builder.put(next);
            flipperObject = flipperObject.getObject(next);
            keys = flipperObject.keys();
        }
        return builder.build();
    }

    protected abstract NodeDescriptor<Object> descriptorForObject(Object obj);

    void hitTest(int i, int i2) throws Exception {
        NodeDescriptor<Object> descriptorForObject = descriptorForObject(this.mApplication);
        Pair<Touch, Stack<FlipperObject.Builder>> createTouch = createTouch(i, i2, false);
        descriptorForObject.hitTest(this.mApplication, (Touch) createTouch.first);
        FlipperObject build = new FlipperObject.Builder().put(trackObject(this.mApplication), (FlipperObject.Builder) ((Stack) createTouch.second).pop()).build();
        this.mConnection.send(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT, new FlipperObject.Builder().put("tree", build).put("path", getPathFromTree(build)).build());
        Pair<Touch, Stack<FlipperObject.Builder>> createTouch2 = createTouch(i, i2, true);
        descriptorForObject.axHitTest(this.mApplication, (Touch) createTouch2.first);
        FlipperObject build2 = new FlipperObject.Builder().put(trackObject(this.mApplication), (FlipperObject.Builder) ((Stack) createTouch2.second).pop()).build();
        this.mConnection.send("selectAX", new FlipperObject.Builder().put("tree", build2).put("path", getPathFromTree(build2)).build());
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.mConnection != null && AccessibilityUtil.isTalkbackEnabled(getContext()) && motionEvent.getPointerCount() == 1) {
            this.mConnection.send("track", new FlipperObject.Builder().put(MessageAttributes.TYPE, "usage").put("eventName", "accessibility:clickToInspectTalkbackRunning").build());
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action != 9) {
                    if (action == 10) {
                        motionEvent.setAction(1);
                    }
                } else {
                    motionEvent.setAction(0);
                }
            } else {
                motionEvent.setAction(2);
            }
            return onTouchEvent(motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return true;
        }
        new ErrorReportingRunnable(this.mConnection) { // from class: com.facebook.flipper.plugins.inspector.TouchOverlayView.1
            @Override // com.facebook.flipper.core.ErrorReportingRunnable
            public void runOrThrow() throws Exception {
                TouchOverlayView.this.hitTest((int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }.run();
        return true;
    }

    protected abstract String trackObject(Object obj) throws Exception;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.flipper.plugins.inspector.TouchOverlayView$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Touch {
        final /* synthetic */ boolean val$ax;
        final /* synthetic */ Stack val$nodes;
        final /* synthetic */ Stack val$objStack;
        final /* synthetic */ int val$touchX;
        final /* synthetic */ int val$touchY;
        int x;
        int y;

        AnonymousClass2(int i, int i2, Stack stack, boolean z, Stack stack2) {
            this.val$touchX = i;
            this.val$touchY = i2;
            this.val$nodes = stack;
            this.val$ax = z;
            this.val$objStack = stack2;
            this.x = i;
            this.y = i2;
        }

        @Override // com.facebook.flipper.plugins.inspector.Touch
        public boolean containedIn(int i, int i2, int i3, int i4) {
            int i5;
            int i6 = this.x;
            if (i6 >= i && i6 <= i3 && (i5 = this.y) >= i2 && i5 <= i4) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.flipper.plugins.inspector.Touch
        public void continueWithOffset(final int i, final int i2, final int i3) {
            new ErrorReportingRunnable(TouchOverlayView.this.mConnection) { // from class: com.facebook.flipper.plugins.inspector.TouchOverlayView.2.1
                @Override // com.facebook.flipper.core.ErrorReportingRunnable
                protected void runOrThrow() throws Exception {
                    Object assertNotNull;
                    Object peek = AnonymousClass2.this.val$nodes.peek();
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    anonymousClass2.x -= i2;
                    anonymousClass2.y -= i3;
                    if (anonymousClass2.val$ax) {
                        assertNotNull = InspectorFlipperPlugin.assertNotNull(TouchOverlayView.this.descriptorForObject(peek).getAXChildAt(peek, i));
                    } else {
                        assertNotNull = InspectorFlipperPlugin.assertNotNull(TouchOverlayView.this.descriptorForObject(peek).getChildAt(peek, i));
                    }
                    AnonymousClass2.this.val$nodes.push(assertNotNull);
                    String trackObject = TouchOverlayView.this.trackObject(assertNotNull);
                    NodeDescriptor<Object> descriptorForObject = TouchOverlayView.this.descriptorForObject(assertNotNull);
                    AnonymousClass2.this.val$objStack.push(new FlipperObject.Builder());
                    if (AnonymousClass2.this.val$ax) {
                        descriptorForObject.axHitTest(assertNotNull, this);
                    } else {
                        descriptorForObject.hitTest(assertNotNull, this);
                    }
                    AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                    anonymousClass22.x += i2;
                    anonymousClass22.y += i3;
                    anonymousClass22.val$nodes.pop();
                    ((FlipperObject.Builder) AnonymousClass2.this.val$objStack.peek()).put(trackObject, ((FlipperObject.Builder) AnonymousClass2.this.val$objStack.pop()).build());
                }
            }.run();
        }

        @Override // com.facebook.flipper.plugins.inspector.Touch
        public void finish() {
        }
    }
}
