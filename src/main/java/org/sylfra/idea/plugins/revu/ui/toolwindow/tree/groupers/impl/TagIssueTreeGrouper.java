package org.sylfra.idea.plugins.revu.ui.toolwindow.tree.groupers.impl;

import org.jetbrains.annotations.NotNull;
import org.sylfra.idea.plugins.revu.RevuBundle;
import org.sylfra.idea.plugins.revu.model.Issue;
import org.sylfra.idea.plugins.revu.model.IssueTag;
import org.sylfra.idea.plugins.revu.ui.toolwindow.tree.groupers.AbstractIssueTreeGrouper;

import java.util.List;

/**
 * @author <a href="mailto:syllant@gmail.com">Sylvain FRANCOIS</a>
 * @version $Id$
 */
public class TagIssueTreeGrouper extends AbstractIssueTreeGrouper<IssueTag>
{
  @Override
  @NotNull
  protected List<IssueTag> getGroupObjects(@NotNull Issue issue)
  {
    return issue.getTags();
  }

  @Override
  @NotNull
  protected String getGroupName(@NotNull IssueTag tag)
  {
    return tag.getName();
  }

  public String getName()
  {
    return RevuBundle.message("browsing.filteringGrouping.tag.text");
  }
}