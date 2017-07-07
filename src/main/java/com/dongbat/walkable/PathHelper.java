/*
 * Copyright 2017 Dong Bat Co.,Ltd..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dongbat.walkable;

import haxe.root.Array;
import hxDaedalus.ai.EntityAI;
import hxDaedalus.ai.PathFinder;
import hxDaedalus.data.Mesh;
import hxDaedalus.data.Obstacle;
import hxDaedalus.factories.RectMesh;
import java.util.List;

/**
 *
 * @author tao
 */
public class PathHelper {

  private final Mesh mesh;
  private final EntityAI entity;
  private final PathFinder pathFinder;
  private final Array path;

  public PathHelper(float w, float h) {
    mesh = RectMesh.buildRectangle(w, h);
    entity = new EntityAI();
    pathFinder = new PathFinder();
    pathFinder.set_mesh(mesh);
    pathFinder.entity = entity;
    path = new Array();
  }

  public Obstacle addPolyline(float[] vertices) {
    return addPolyline(vertices, 0, 0);
  }

  public Obstacle addPolyline(float[] vertices, float x, float y) {
    if (vertices.length < 4) {
      System.out.println("Polylines must contain at least 2 points.");
      return null;
    }
    Obstacle object = new Obstacle();
    Array array = new Array();
    object.set_coordinates(array);
    float prevX = 0, prevY = 0;
    for (int i = 0; i < vertices.length; i += 2) {
      float vx = vertices[i];
      float vy = vertices[i + 1];

      if (i > 0) {
        array.push(prevX);
        array.push(prevY);
        array.push(vx);
        array.push(vy);
      }

      prevX = vx;
      prevY = vy;
    }
    object.set_x(x);
    object.set_y(y);
    mesh.insertObject(object);
    return object;
  }

  public Obstacle addPolygon(float[] vertices) {
    return addPolygon(vertices, 0, 0);
  }

  public Obstacle addPolygon(float[] vertices, float x, float y) {
    if (vertices.length < 6) {
      System.out.println("Polygons must contain at least 3 points.");
      return null;
    }
    Obstacle object = new Obstacle();
    Array array = new Array();
    object.set_coordinates(array);
    float prevX = vertices[vertices.length - 2], prevY = vertices[vertices.length - 1];
    for (int i = 0; i < vertices.length; i += 2) {
      float vx = vertices[i];
      float vy = vertices[i + 1];

      array.push(prevX);
      array.push(prevY);
      array.push(vx);
      array.push(vy);

      prevX = vx;
      prevY = vy;
    }
    object.set_x(x);
    object.set_y(y);
    mesh.insertObject(object);

    return object;
  }

  public Obstacle addRect(float x, float y, float w, float h) {
    Obstacle object = new Obstacle();
    Array array = new Array();
    array.push(0);
    array.push(0);

    array.push(w);
    array.push(0);

    array.push(w);
    array.push(0);

    array.push(w);
    array.push(h);

    array.push(w);
    array.push(h);

    array.push(0);
    array.push(h);

    array.push(0);
    array.push(h);

    array.push(0);
    array.push(0);

    object.set_coordinates(array);
    object.set_x(x);
    object.set_y(y);
    mesh.insertObject(object);

    return object;
  }

  public void removeObstacle(Obstacle obstacle) {
    mesh.deleteObject(obstacle);
  }

  private void doFindPath(float fromX, float fromY, float toX, float toY, float radius) {
    entity.set_radius(radius);
    entity.x = fromX;
    entity.y = fromY;
    try {
      pathFinder.findPath(toX, toY, path);
    } catch (Exception e) {
      path.splice(0, path.length);
      System.out.println(e.getMessage());
    }
  }

  public float[] findPath(float fromX, float fromY, float toX, float toY, float radius) {
    doFindPath(fromX, fromY, toX, toY, radius);

    float[] result = new float[path.length];

    for (int i = 0; i < path.length; i++) {
      result[i] = ((Double) path.__get(i)).floatValue();
    }
    return result;
  }

  public int findPath(float fromX, float fromY, float toX, float toY, float radius, float[] result) {
    doFindPath(fromX, fromY, toX, toY, radius);

    for (int i = 0; i < path.length; i++) {
      result[i] = ((Double) path.__get(i)).floatValue();
    }
    return path.length;
  }

  public void findPath(float fromX, float fromY, float toX, float toY, float radius, List<Float> result) {
    doFindPath(fromX, fromY, toX, toY, radius);

    result.clear();
    for (int i = 0; i < path.length; i++) {
      result.add(((Double) path.__get(i)).floatValue());
    }
  }

  public void findPath(float fromX, float fromY, float toX, float toY, float radius, FloatArray result) {
    doFindPath(fromX, fromY, toX, toY, radius);

    result.clear();
    for (int i = 0; i < path.length; i++) {
      result.add(((Double) path.__get(i)).floatValue());
    }
  }
}