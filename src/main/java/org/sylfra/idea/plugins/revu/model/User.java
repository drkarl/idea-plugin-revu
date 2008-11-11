package org.sylfra.idea.plugins.revu.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author <a href="mailto:sylfradev@yahoo.fr">Sylvain FRANCOIS</a>
 * @version $Id$
 */
public class User implements Comparable<User>
{
  public static enum Role
  {
    ADMIN,
    RECIPIENT
  }

  public final static User UNKNOWN = new User("<unknown>", null, "<unknown>");

  private String login;
  private String password;
  private String displayName;
  private Set<Role> roles;

  public User()
  {
    roles = new HashSet<Role>();
  }

  public User(@NotNull String login, @Nullable String password, @NotNull String displayName,
    User.Role... roles)
  {
    this();
    this.login = login;
    this.password = password;
    this.displayName = displayName;
    this.roles = new HashSet<User.Role>(Arrays.asList(roles));
  }

  @NotNull
  public String getDisplayName()
  {
    return displayName;
  }

  public void setDisplayName(@NotNull String displayName)
  {
    this.displayName = displayName;
  }

  @NotNull
  public String getLogin()
  {
    return login;
  }

  public void setLogin(@NotNull String login)
  {
    this.login = login;
  }

  @Nullable
  public String getPassword()
  {
    return password;
  }

  public void setPassword(@Nullable String password)
  {
    this.password = password;
  }

  @NotNull
  public Set<Role> getRoles()
  {
    return roles;
  }

  public void setRoles(@NotNull Set<Role> roles)
  {
    this.roles = roles;
  }

  @NotNull
  public void addRole(Role role)
  {
    roles.add(role);
  }

  public int compareTo(User other)
  {
    return displayName.compareTo(other.getDisplayName());
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }

    User user = (User) o;

    if (displayName != null ? !displayName.equals(user.displayName) : user.displayName != null)
    {
      return false;
    }
    if (login != null ? !login.equals(user.login) : user.login != null)
    {
      return false;
    }
    if (password != null ? !password.equals(user.password) : user.password != null)
    {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode()
  {
    int result = login != null ? login.hashCode() : 0;
    result = 31 * result + (password != null ? password.hashCode() : 0);
    result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
    return result;
  }

  @Override
  public String toString()
  {
    return new ToStringBuilder(this).
      append("login", login).
      append("password", password).
      append("displayName", displayName).
      toString();
  }
}
