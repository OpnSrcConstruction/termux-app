package com.termux.view;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/**
 * Input and scale listener which may be set on a {@link TerminalView} through
 * {@link TerminalView#setOnKeyListener(TerminalKeyListener)}.
 */
public interface TerminalKeyListener {

	/** Callback function on scale events according to {@link ScaleGestureDetector#getScaleFactor()}. */
	float onScale(float scale);

	void onLongPress(MotionEvent e);

	/** On a single tap on the terminal if terminal mouse reporting not enabled. */
	void onSingleTapUp(MotionEvent e);

}
