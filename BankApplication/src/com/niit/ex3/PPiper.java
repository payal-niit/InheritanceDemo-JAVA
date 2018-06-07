package com.niit.ex3;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PPiper {

	public static void establishConnection(PipedInputStream cpis, PipedOutputStream cpos) throws IOException {

		PipedInputStream spis = new PipedInputStream();
		PipedOutputStream spos = new PipedOutputStream();

		spis.connect(cpos);
		spos.connect(cpis);

		try {
			FServer.initialize(spis, spos);
		} catch (Exception e) {
			throw new IOException("Unable to initialize server");
		}

	}

}