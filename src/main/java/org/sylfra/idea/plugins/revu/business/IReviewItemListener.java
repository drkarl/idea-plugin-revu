package org.sylfra.idea.plugins.revu.business;

import org.sylfra.idea.plugins.revu.model.ReviewItem;

/**
 * @author <a href="mailto:sylfradev@yahoo.fr">Sylvain FRANCOIS</a>
 * @version $Id$
 */
public interface IReviewItemListener
{
  void itemAdded(ReviewItem item);

  void itemDeleted(ReviewItem item);

  void itemUpdated(ReviewItem item);
}