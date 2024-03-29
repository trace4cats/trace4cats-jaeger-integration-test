import sbt._

object Dependencies {
  object Versions {
    val scala212 = "2.12.18"
    val scala213 = "2.13.11"
    val scala3 = "3.3.0"

    val trace4cats = "0.14.3"

    val circe = "0.14.5"
    val http4s = "0.23.21"

    val http4sBlaze = "0.23.15"

    val logback = "1.2.13"

    val kindProjector = "0.13.2"
    val betterMonadicFor = "0.3.1"
  }

  lazy val trace4catsKernel = "io.janstenpickle"  %% "trace4cats-kernel"  % Versions.trace4cats
  lazy val trace4catsTestkit = "io.janstenpickle" %% "trace4cats-testkit" % Versions.trace4cats

  lazy val circeGeneric = "io.circe"        %% "circe-generic"       % Versions.circe
  lazy val http4sCirce = "org.http4s"       %% "http4s-circe"        % Versions.http4s
  lazy val http4sBlazeClient = "org.http4s" %% "http4s-blaze-client" % Versions.http4sBlaze
  lazy val logback = "ch.qos.logback"        % "logback-classic"     % Versions.logback

  lazy val kindProjector = ("org.typelevel" % "kind-projector"     % Versions.kindProjector).cross(CrossVersion.full)
  lazy val betterMonadicFor = "com.olegpy" %% "better-monadic-for" % Versions.betterMonadicFor
}
