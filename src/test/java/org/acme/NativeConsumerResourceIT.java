package org.acme;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeConsumerResourceIT extends ConsumerResourceTest {

    // Execute the same tests but in native mode.
}