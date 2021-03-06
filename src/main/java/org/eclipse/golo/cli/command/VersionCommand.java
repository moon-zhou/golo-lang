/*
 * Copyright (c) 2012-2017 Institut National des Sciences Appliquées de Lyon (INSA-Lyon)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.golo.cli.command;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import org.eclipse.golo.cli.command.spi.CliCommand;

@Parameters(commandNames = {"version"}, resourceBundle = "commands", commandDescriptionKey = "version")
public class VersionCommand implements CliCommand {

  @Parameter(names = "--full", description = "version.full")
  boolean full = false;

  @Override
  public void execute() throws Throwable {
    if (this.full) {
      System.out.println("Golo: " + Metadata.VERSION + " (build " + Metadata.TIMESTAMP + ")");
      System.out.println("JVM: " + System.getProperty("java.version"));
    } else {
      System.out.println(Metadata.VERSION);
    }
  }
}
