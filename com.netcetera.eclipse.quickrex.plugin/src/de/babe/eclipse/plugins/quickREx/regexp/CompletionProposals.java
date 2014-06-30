/*******************************************************************************
 * Copyright (c) 2007 Bastian Bergerhoff and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution.
 *
 * Contributors:
 *     Bastian Bergerhoff - initial API and implementation
 *******************************************************************************/
package de.babe.eclipse.plugins.quickREx.regexp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bastian.bergerhoff
 */
public class CompletionProposals {

  private volatile List<String> keysMap;
  private volatile Map<String, RECompletionProposal> proposalsMap;

  /**
   * The constructor.
   */
  public CompletionProposals() {
    keysMap = new ArrayList<>();
    proposalsMap = new HashMap<>();
  }

  /**
   * Returns a list of completion-proposal-keys for the passed flavour (one of the constants
   * defined in MatchSetFactory).
   *
   * @return an ArrayList of keys for the flavour
   */
  List<String> getKeys() {
    return keysMap;
  }

  /**
   * Returns the proposal for the passed flavour with the passed key.
   *
   * @param p_proposalKey the key for the proposal
   * @return the RECompletionProposal
   */
  public RECompletionProposal getProposal(String p_proposalKey) {
    return proposalsMap.get(p_proposalKey);
  }

  /**
   * Sets the keys-list (as passed) for the passed flavour.
   *
   * @param p_keys the list of keys
   */
  public void setKeys(List<String> p_keys) {
    keysMap = p_keys;
  }

  /**
   * Sets the proposals-map (as passed) for the passed flavour.
   *
   * @param p_proposals the HashMap with proposals (String-keys mapped to RECompletionProposal-instances)
   */
  public void setProposals(Map<String, RECompletionProposal> p_proposals) {
    proposalsMap = p_proposals;
  }

  /**
   * Copies key-lists and proposal-maps to the passed instance.
   *
   * @param p_proposals the instance to initialize
   */
  public void copyValuesTo(CompletionProposals p_proposals) {
    p_proposals.keysMap = this.keysMap;
    p_proposals.proposalsMap = this.proposalsMap;
  }
}
